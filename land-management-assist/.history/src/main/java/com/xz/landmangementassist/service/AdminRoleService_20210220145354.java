package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;

/**
 * AdminRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRoleService {
    /**
     * 角色列表（带权限和菜单）
     * 
     * @return
     */
    public List<AdminRoleDTO> list();

    /**
     * 角色列表
     * 
     * @return
     */
    public List<AdminRoleDTO> findAll();

    /**
     * 保存
     * 
     * @param adminRoleDTO
     * @return
     */
    public AdminRoleDTO save(AdminRoleDTO adminRole);

    /**
     * 保存角色和关联的权限
     * 
     * @param adminRole
     * @return
     */
    public AdminRoleDTO saveRolePermission(AdminRoleDTO adminRole);

    /**
     * 按用户名返回角色列表
     * 
     * @param username
     * @return
     */
    public List<AdminRoleDTO> getListByUsername(String username);

    /**
     * 删除
     * 
     * @param adminRole
     * @return
     */
    public AdminRoleDTO delete(AdminRoleDTO adminRole);

}
