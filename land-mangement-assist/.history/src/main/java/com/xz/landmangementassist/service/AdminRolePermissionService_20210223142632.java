package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.dto.admin.AdminRolePermissionDTO;

/**
 * AdminRolePermissionService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRolePermissionService {
    /**
     * save
     * 
     * @param permissionId
     * @param adminPermissionList
     * @return
     */
    public List<AdminRolePermissionDTO> save(Integer permissionId, List<AdminPermissionDTO> adminPermissionList);
}
