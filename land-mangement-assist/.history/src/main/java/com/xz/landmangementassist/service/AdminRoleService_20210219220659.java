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
     * @return
     */
    public Result<AdminRoleDTO> save(AdminRoleDTO adminRole);

    /**
     * 保存角色和关联的权限
     * 
     * @param adminRole
     * @return
     */
    public Result<AdminRoleDTO> saveRolePermission(AdminRoleDTO adminRole);

    /**
     * 按用户名返回角色列表
     * 
     * @param username
     * @return
     */
    public Result<List<AdminRoleDTO>> getListByUsername(String username);

}
