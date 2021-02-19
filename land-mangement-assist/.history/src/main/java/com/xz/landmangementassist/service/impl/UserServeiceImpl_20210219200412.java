package com.xz.landmangementassist.service.impl;

import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmangementassist.service.UserService;

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

}
