package com.xz.landmangementassist.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminRoleEntity;

/**
 * AdminRoleService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:54:21
 */
public interface AdminRoleService extends IService<AdminRoleEntity> {
    /**
     * 角色列表（带权限和菜单）
     * 
     * @return
     */
    public List<AdminRoleDTO> listDTO();

    /**
     * 保存角色和关联的权限
     * 
     * @param adminRole
     * @return
     */
    public boolean saveRolePermission(AdminRoleDTO adminRole);

    /**
     * 按用户名返回角色列表
     * 
     * @param username
     * @return
     */
    public List<AdminRoleDTO> getListByUsername(String username);

}
