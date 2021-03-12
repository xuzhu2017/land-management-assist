package com.xz.landmanagementassist.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminMenuEntity;

/**
 * AdminMenuService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminMenuService extends IService<AdminMenuEntity> {
    /**
     * 获取当前用户菜单
     * 
     * @return
     */
    public List<AdminMenuDTO> getMenusByCurrentUser();

    /**
     * 根据角色获取菜单
     * 
     * @param roleId
     * @return
     */
    public List<AdminMenuDTO> getMenusByRoleId(Integer roleId);
}
