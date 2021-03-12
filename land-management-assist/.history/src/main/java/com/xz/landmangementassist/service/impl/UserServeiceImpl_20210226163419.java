package com.xz.landmanagementassist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.repository.admin.UserDAO;
import com.xz.landmanagementassist.service.UserService;
import com.xz.landmanagementassist.utils.MyBeanUtil;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * UserServeiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
@Service
public class UserServeiceImpl extends ServiceImpl<UserDAO, UserEntity> implements UserService {

    private String algorithmName = "md5";
    private int hashIterations = 2;// 哈希迭代次数

    @Autowired
    UserDAO userDAO;

    @Override
    public PagedResult<UserDTO> selectUserList(UserQueryDTO queryDTO) {
        // TODO Auto-generated method stub
        return null;
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
    public boolean register(UserDTO user) {

        Assert.isTrue(!user.getUsername().isEmpty() && !user.getPassword().isEmpty(), "用户名和密码不能为空！");

        Assert.isTrue(!isExist(user.getUsername()), "用户已存在！");

        UserEntity userEntity = MyBeanUtil.transformFrom(user, UserEntity.class);
        userEntity.setDeleted(false);

        // 默认生成 16 位盐
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        String encodedPassword = new SimpleHash(algorithmName, userEntity.getPassword(), salt, hashIterations)
                .toString();

        userEntity.setSalt(salt);
        userEntity.setPassword(encodedPassword);

        userDAO.save(user);

        return false;
    }

    @Override
    public UserDTO update(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(UserDTO user) {
        return removeById(user.getId());
    }

    @Override
    public UserDTO resetPassword(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

}
