package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminUserRoleDTO;

/**
 * AdminUserRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminUserRoleService {
    /**
     * 根据用户Id获取角色
     * 
     * @param userId
     * @return
     */
    public Result<List<AdminUserRoleDTO>> getListByUserId(Integer userId);
}
