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
        // TODO Auto-generated method stub
        return true;
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
        queryWrapper.eq("username", username);
        queryWrapper.eq("password", password);
        return MyBeanUtil.transformFrom(getOne(queryWrapper), UserDTO.class);
        ;
    }

    @Override
    public UserDTO register(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDTO update(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDTO delete(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDTO resetPassword(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

}
