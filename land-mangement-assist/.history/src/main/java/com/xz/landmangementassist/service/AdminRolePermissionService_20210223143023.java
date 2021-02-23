package com.xz.landmangementassist.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.dto.admin.AdminRolePermissionDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminRolePermissionEntity;

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
     * @param permissionId
     * @param adminPermissionList
     * @return
     */
    public List<AdminRolePermissionDTO> saveRolePermissionList(Integer permissionId,
            List<AdminPermissionDTO> adminPermissionList);
}
