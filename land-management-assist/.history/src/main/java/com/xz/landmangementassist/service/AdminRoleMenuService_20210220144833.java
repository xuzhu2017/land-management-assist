package com.xz.landmanagementassist.service;

import java.util.List;
import java.util.Map;

import com.xz.landmanagementassist.domain.dto.admin.AdminRoleMenuDTO;

/**
 * AdminRoleMenuService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminRoleMenuService {
    /**
     * 根据角色Id获取List<AdminRoleMenuDTO>
     * 
     * @param roleId
     * @return
     */
    public List<AdminRoleMenuDTO> getListByRoleId(Integer roleId);

    /**
     * 根据角色IdList获取List<AdminRoleMenuDTO>
     * 
     * @param roleIdList
     * @return
     */
    public List<AdminRoleMenuDTO> getListByRoleIdList(List<Integer> roleIdList);

    /**
     * 保存
     * 
     * @param adminRoleMenu
     * @return
     */
    public AdminRoleMenuDTO save(AdminRoleMenuDTO adminRoleMenu);

    /**
     * 根据角色更新菜单
     * 
     * @param roleId
     * @param menusIds
     * @return
     */
    public List<AdminRoleMenuDTO> updateList(Integer roleId, Map<String, List<Integer>> menusIds);
}
