package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminRolePermissionDTO;

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
    public Result<List<AdminRolePermissionDTO>> getListBypermissionId(Integer permissionId);

    /**
     * 保存
     * 
     * @param permissionId
     * @param adminPermissionList
     * @return
     */
    public Result<List<AdminRolePermissionDTO>> save(Integer permissionId,
            List<AdminPermissionDTO> adminPermissionList);
}
