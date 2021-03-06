package com.xz.landmanagementassist.service.admin;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRolePermissionEntity;

/**
 * AdminRolePermissionService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRolePermissionService extends IService<AdminRolePermissionEntity> {
    /**
     * 保存RolePermissionList
     * 
     * @param roleId
     * @param adminPermissionList
     * @return
     */
    public void saveRolePermissionList(Integer roleId, List<AdminPermissionDTO> adminPermissionList);
}
