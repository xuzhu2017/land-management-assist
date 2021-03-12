package com.xz.landmanagementassist.service.impl;

import java.util.List;

import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminRolePermissionDTO;
import com.xz.landmanagementassist.service.AdminRolePermissionService;

import org.springframework.stereotype.Service;

/**
 * AdminRolePermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRolePermissionServiceImpl implements AdminRolePermissionService {

    @Override
    @Transactional
    public List<AdminRolePermissionDTO> save(Integer permissionId, List<AdminPermissionDTO> adminPermissionList) {
        // TODO Auto-generated method stub
        return null;
    }

}
