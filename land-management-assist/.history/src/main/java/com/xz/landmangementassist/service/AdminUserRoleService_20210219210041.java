package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminUserRoleDTO;

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
    public Result<List<AdminUserRoleDTO>> getListByUserId(Integer userId);

    /**
     * 修改userId对应List<AdminUserRoleDTO>
     * 
     * @param userId
     * @param adminUserRoleList
     */
    public void update(Integer userId, List<AdminUserRoleDTO> adminUserRoleList);
}
