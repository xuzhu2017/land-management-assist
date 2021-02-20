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
     * 根据权限获取列表
     * 
     * @param permissionId
     * @return
     */
    public List<AdminRolePermissionDTO> getListBypermissionId(Integer permissionId);

    /**
     * save
     * 
     * @param permissionId
     * @param adminPermissionList
     * @return
     */
    public List<AdminRolePermissionDTO> save(Integer permissionId,
            List<AdminPermissionDTO> adminPermissionList);
}
