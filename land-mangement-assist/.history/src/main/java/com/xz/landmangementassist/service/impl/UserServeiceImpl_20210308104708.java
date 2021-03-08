package com.xz.landmangementassist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmangementassist.domain.entity.admin.UserEntity;
import com.xz.landmangementassist.repository.admin.UserDAO;
import com.xz.landmangementassist.service.UserService;
import com.xz.landmangementassist.utils.MyBeanUtil;
import com.xz.landmangementassist.utils.ServiceUtil;

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

    @Autowired
    UserDAO userDAO;

    @Override
    public IPage<UserDTO> selectUserList(UserQueryDTO queryDTO) {
        // TODO Auto-generated method stub
        IPage<UserEntity> page = new Page<>(queryDTO.getPageParam().getPageNum(),
                queryDTO.getPageParam().getPageSize());
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
