package com.xz.landmanagementassist.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleEntity;
import com.xz.landmanagementassist.repository.admin.AdminRoleDAO;
import com.xz.landmanagementassist.service.AdminRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminRoleServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleDAO, AdminRoleEntity> implements AdminRoleService {
    @Autowired
    AdminRoleDAO adminRoleDAO;

    @Override
    public List<AdminRoleDTO> listDTO() {
        List<AdminRoleEntity> roleList = list();

        return null;
    }

    @Override
    public List<AdminRoleDTO> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdminRoleDTO save(AdminRoleDTO adminRole) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdminRoleDTO saveRolePermission(AdminRoleDTO adminRole) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AdminRoleDTO> getListByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdminRoleDTO delete(AdminRoleDTO adminRole) {
        // TODO Auto-generated method stub
        return null;
    }

}
