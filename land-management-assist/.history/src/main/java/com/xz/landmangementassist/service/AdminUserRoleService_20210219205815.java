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
    public Result<List<AdminUserRoleDTO>> getListByUserId(Integer userId);
}
