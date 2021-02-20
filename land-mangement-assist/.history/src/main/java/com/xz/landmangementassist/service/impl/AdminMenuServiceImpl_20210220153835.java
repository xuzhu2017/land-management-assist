package com.xz.landmangementassist.service.impl;

import java.util.List;

import com.xz.landmangementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmangementassist.repository.admin.AdminMenuDAO;
import com.xz.landmangementassist.service.AdminMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminMenuServiceImpl implements AdminMenuService {

    @Autowired
    AdminMenuDAO adminMenuDAO;

    @Override
    public List<AdminMenuDTO> getListByParentId(int parentId) {
        // TODO Auto-generated method stub
        return adminMenuDAO.selectList(queryWrapper);
    }

    @Override
    public List<AdminMenuDTO> getMenusByCurrentUser() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AdminMenuDTO> getMenusByRoleId(Integer roleId) {
        // TODO Auto-generated method stub
        return null;
    }

}
