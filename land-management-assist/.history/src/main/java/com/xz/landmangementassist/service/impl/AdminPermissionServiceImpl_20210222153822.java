package com.xz.landmanagementassist.service.impl;

import java.util.List;
import java.util.Set;

import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.repository.admin.AdminPermissionDAO;
import com.xz.landmanagementassist.service.AdminPermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminPermissionServiceImpl implements AdminPermissionService {

    @Autowired
    AdminPermissionDAO adminPermissionDAO;

    @Override
    public List<AdminPermissionDTO> list() {
        // TODO Auto-generated method stub
        return adminPermissionDAO.selectList(new Wrapper<AdminPermissionEntity>());
    }

    @Override
    public boolean needFilter(String requestAPI) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<AdminPermissionDTO> getListByRoleId(Integer roleId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> listPermissionURLsByUser(String username) {
        // TODO Auto-generated method stub
        return null;
    }

}
