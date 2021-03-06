package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.dto.admin.AdminUserRoleDTO;

/**
 * AdminUserRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminUserRoleService {
    /**
     * 修改userId对应List<AdminUserRoleDTO>
     * 
     * @param userId
     * @param adminUserRoleDTOList
     * @return
     */
    public AdminUserRoleDTO update(Integer userId, List<AdminUserRoleDTO> adminUserRoleDTOList);
}
