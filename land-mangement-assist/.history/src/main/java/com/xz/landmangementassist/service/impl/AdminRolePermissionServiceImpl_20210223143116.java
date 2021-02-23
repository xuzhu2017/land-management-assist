package com.xz.landmangementassist.service.impl;

import java.util.List;

import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.dto.admin.AdminRolePermissionDTO;
import com.xz.landmangementassist.service.AdminRolePermissionService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AdminRolePermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRolePermissionServiceImpl extends ServiceImpl<AdminRoleMenuDAO, AdminRoleMenuEntity>
        implements AdminRolePermissionService {

    @Override
    @Transactional
    public List<AdminRolePermissionDTO> saveRolePermissionList(Integer permissionId,
            List<AdminPermissionDTO> adminPermissionList) {
        // TODO Auto-generated method stub
        return null;
    }

}
