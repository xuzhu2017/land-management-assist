package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;

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

    /**
     * 角色列表
     * 
     * @return
     */
    public Result<List<AdminRoleDTO>> findAll();

    /**
     * 保存
     * 
     * @param adminRoleDTO
     */
    public void save(AdminRoleDTO adminRole);

    public Result<List<AdminRoleDTO>> getListByUsername();
}
