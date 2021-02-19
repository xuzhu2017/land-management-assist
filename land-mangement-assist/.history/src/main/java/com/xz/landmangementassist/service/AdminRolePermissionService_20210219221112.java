package com.xz.landmangementassist.service;

/**
 * AdminRolePermissionService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRolePermissionService {
    /**
     * 
     * @param permissionId
     * @return
     */
    public Result<List<AdminRolePermissionDTO>> getListBypermissionId(Integer permissionId);
}
