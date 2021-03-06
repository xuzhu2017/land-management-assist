package com.xz.landmanagementassist.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.repository.admin.UserDAO;
import com.xz.landmanagementassist.service.admin.UserService;
import com.xz.landmanagementassist.utils.MyBeanUtil;
import com.xz.landmanagementassist.utils.ServiceUtil;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.HtmlUtils;

/**
 * UserServeiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
@Service
public class UserServeiceImpl extends ServiceImpl<UserDAO, UserEntity> implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public IPage<UserEntity> selectUserList(UserQueryDTO queryDTO) {
        IPage<UserEntity> page = new Page<>(queryDTO.getPageParam().getPageNum(),
                queryDTO.getPageParam().getPageSize());
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username", queryDTO.getKeyword()).or().like("name", queryDTO.getKeyword());// 关键字查询用户名和真名
        // 排序
        queryDTO.getPageParam().getOrders().stream().forEach(orderItem -> {
            if (orderItem.isAsc()) {
                queryWrapper.orderByAsc(orderItem.getColumn());
            } else {
                queryWrapper.orderByDesc(orderItem.getColumn());
            }
        });

        return page(page, queryWrapper);
    }

    @Override
    public boolean isExist(String username) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return getOne(queryWrapper) != null;
    }

    @Override
    public UserDTO getByUsername(String username) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return MyBeanUtil.transformFrom(getOne(queryWrapper), UserDTO.class);
    }

    @Override
    public UserDTO get(String username, String password) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username).eq("password", password);
        return MyBeanUtil.transformFrom(getOne(queryWrapper), UserDTO.class);
    }

    @Override
    public Result<UserDTO> login(UserDTO user) {
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);

        Subject subject = SecurityUtils.getSubject();
        // subject.getSession().setTimeout(10000);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, user.getPassword());
        usernamePasswordToken.setRememberMe(true);
        try {
            subject.login(usernamePasswordToken);
            UserDTO userDTO = getByUsername(username);
            if (!userDTO.isDeleted()) {
                return Result.error("该用户已被禁用");
            }
            return Result.success(userDTO);
        } catch (IncorrectCredentialsException e) {
            return Result.error("密码错误");
        } catch (UnknownAccountException e) {
            return Result.error("账号不存在");
        }
    }

    @Override
    public boolean register(UserDTO user) {

        Assert.isTrue(!user.getUsername().isEmpty() && !user.getPassword().isEmpty(), "用户名和密码不能为空！");

        Assert.isTrue(!isExist(user.getUsername()), "用户已存在！");

        UserEntity userEntity = MyBeanUtil.transformFrom(user, UserEntity.class);
        userEntity.setDeleted(false);

        ServiceUtil.passwordEncryption(userEntity);

        return save(userEntity);
    }

    @Override
    public boolean update(UserDTO user) {
        return updateById(MyBeanUtil.transformFrom(user, UserEntity.class));
    }

    @Override
    public boolean delete(UserDTO user) {
        return removeById(user.getId());
    }

    @Override
    public UserDTO resetPassword(UserDTO user) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        UserEntity userEntity = getOne(queryWrapper);

        ServiceUtil.passwordEncryption(userEntity);

        update(userEntity, queryWrapper);

        return MyBeanUtil.transformFrom(userEntity, UserDTO.class);
    }

}
