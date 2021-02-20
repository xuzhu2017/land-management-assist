package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.dto.admin.AdminUserRoleDTO;

/**
 * AdminUserRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminUserRoleService {
    /**
     * 根据用户Id获取List<AdminUserRoleDTO>
     * 
     * @param userId
     * @return
     */
    public List<AdminUserRoleDTO> getListByUserId(Integer userId);

    /**
     * 修改userId对应List<AdminUserRoleDTO>
     * 
     * @param userId
     * @param adminUserRoleDTOList
     * @return
     */
    public AdminUserRoleDTO update(Integer userId, List<AdminUserRoleDTO> adminUserRoleDTOList);
}
