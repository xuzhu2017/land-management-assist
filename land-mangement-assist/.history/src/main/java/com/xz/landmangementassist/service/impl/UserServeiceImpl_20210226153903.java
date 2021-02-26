package com.xz.landmangementassist.service.impl;

import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmangementassist.repository.admin.UserDAO;
import com.xz.landmangementassist.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServeiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
@Service
public class UserServeiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public PagedResult<UserDTO> selectEmployeeList(UserQueryDTO queryDTO) {
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDTO get(String username, String password) {
        // TODO Auto-generated method stub
        return null;
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
