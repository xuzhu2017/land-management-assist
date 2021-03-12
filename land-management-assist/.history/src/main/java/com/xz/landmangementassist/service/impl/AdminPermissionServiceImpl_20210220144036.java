package com.xz.landmanagementassist.service.impl;

import java.util.List;
import java.util.Set;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.service.AdminPermissionService;

public class AdminPermissionServiceImpl implements AdminPermissionService {

    @Override
    public Result<List<AdminPermissionDTO>> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean needFilter(String requestAPI) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Result<List<AdminPermissionDTO>> getListByRoleId(Integer roleId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> listPermissionURLsByUser(String username) {
        // TODO Auto-generated method stub
        return null;
    }

}
