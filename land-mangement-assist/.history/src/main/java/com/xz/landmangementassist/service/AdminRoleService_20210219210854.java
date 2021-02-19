package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleDTO;

/**
 * AdminRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRoleService {
    /**
     * 角色列表
     * 
     * @return
     */
    public Result<List<AdminRoleDTO>> list();

    public Result<List<AdminRoleDTO>> findAll();
}
