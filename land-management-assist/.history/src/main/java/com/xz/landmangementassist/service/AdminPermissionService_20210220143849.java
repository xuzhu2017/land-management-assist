package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;

/**
 * AdminPermissionService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminPermissionService {
    /**
     * list
     * 
     * @return
     */
    public Result<List<AdminPermissionDTO>> list();

    /**
     * Determine whether client requires permission when requests a certain API.
     * 
     * @param requestAPI API requested by client
     * @return true when requestAPI is found in the DB
     */
    public boolean needFilter(String requestAPI);

    public Result<List<AdminPermissionDTO>> getListByRoleId(int roleId)
}
