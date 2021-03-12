package com.xz.landmanagementassist.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleMenuEntity;

/**
 * AdminRoleMenuService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminRoleMenuService extends IService<AdminRoleMenuEntity> {

    /**
     * 根据角色更新菜单
     * 
     * @param roleId
     * @param menusIds
     * @return
     */
    public void updateList(Integer roleId, Map<String, List<Integer>> menusIds);
}
