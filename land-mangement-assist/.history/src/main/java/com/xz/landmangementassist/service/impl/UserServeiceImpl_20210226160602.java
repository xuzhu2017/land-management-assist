package com.xz.landmangementassist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmangementassist.domain.entity.admin.UserEntity;
import com.xz.landmangementassist.repository.admin.UserDAO;
import com.xz.landmangementassist.service.UserService;
import com.xz.landmangementassist.utils.MyBeanUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public UserDTO register(UserDTO user) {
        UserEntity userEntity=
        return null;
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
