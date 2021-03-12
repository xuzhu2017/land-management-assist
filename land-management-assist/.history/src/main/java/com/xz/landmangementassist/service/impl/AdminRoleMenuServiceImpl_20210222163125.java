package com.xz.landmanagementassist.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleMenuEntity;
import com.xz.landmanagementassist.repository.admin.AdminRoleMenuDAO;
import com.xz.landmanagementassist.service.AdminRoleMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }

    @Override
    @Transactional
    public List<AdminRoleMenuDTO> updateList(Integer roleId, Map<String, List<Integer>> menusIds) {
        // TODO Auto-generated method stub
        return null;
    }

}
