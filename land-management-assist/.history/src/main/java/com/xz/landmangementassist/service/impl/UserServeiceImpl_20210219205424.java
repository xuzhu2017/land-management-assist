package com.xz.landmanagementassist.service.impl;

import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmanagementassist.service.UserService;

import org.springframework.stereotype.Service;

/**
 * 用户服务实现
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
@Service
public class UserServeiceImpl implements UserService {

    @Override
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isExist(String username) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Result<UserDTO> getByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result<UserDTO> get(String username, String password) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result<UserDTO> register(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result<UserDTO> update(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result<UserDTO> delete(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result<UserDTO> resetPassword(UserDTO user) {
        // TODO Auto-generated method stub
        return null;
    }

}
