package com.xz.landmangementassist.service.impl;

import java.util.List;
import java.util.Map;

import com.xz.landmangementassist.domain.dto.admin.AdminRoleMenuDTO;
import com.xz.landmangementassist.repository.admin.AdminRoleMenuDAO;
import com.xz.landmangementassist.service.AdminRoleMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminRoleMenuServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRoleMenuServiceImpl implements AdminRoleMenuService {
    @Autowired
    AdminRoleMenuDAO adminRoleMenuDAO;

    @Override
    public AdminRoleMenuDTO save(AdminRoleMenuDTO adminRoleMenu) {
        adminRoleMenuDAO
        return null;
    }

    @Override
    public List<AdminRoleMenuDTO> updateList(Integer roleId, Map<String, List<Integer>> menusIds) {
        // TODO Auto-generated method stub
        return null;
    }

}
