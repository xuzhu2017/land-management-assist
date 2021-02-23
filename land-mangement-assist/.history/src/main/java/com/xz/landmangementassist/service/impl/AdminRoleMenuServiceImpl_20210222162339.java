package com.xz.landmangementassist.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleMenuDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminRoleMenuEntity;
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
public class AdminRoleMenuServiceImpl extends ServiceImpl<AdminRoleMenuDAO, AdminRoleMenuEntity>
        implements AdminRoleMenuService {
    @Autowired
    AdminRoleMenuDAO adminRoleMenuDAO;
    @Autowired
    IService<AdminRoleMenuEntity> adminRoleMenus;

    @Override
    public AdminRoleMenuDTO save(AdminRoleMenuDTO adminRoleMenu) {
        adminRoleMenus.save(entity)
        return null;
    }

    @Override
    public List<AdminRoleMenuDTO> updateList(Integer roleId, Map<String, List<Integer>> menusIds) {
        // TODO Auto-generated method stub
        return null;
    }

}