package com.xz.landmangementassist.service.impl;

import java.util.List;
import java.util.Set;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.service.AdminPermissionService;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
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