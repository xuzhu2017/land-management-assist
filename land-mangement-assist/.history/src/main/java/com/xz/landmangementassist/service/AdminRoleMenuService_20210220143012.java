package com.xz.landmangementassist.service;

import java.util.List;
import java.util.Map;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleMenuDTO;

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
    public Result<List<AdminRoleMenuDTO>> getListByRoleId(Integer roleId);

    /**
     * 根据角色IdList获取List<AdminRoleMenuDTO>
     * 
     * @param roleIdList
     * @return
     */
    public Result<List<AdminRoleMenuDTO>> getListByRoleIdList(List<Integer> roleIdList);

    /**
     * 保存
     * 
     * @param adminRoleMenu
     * @return
     */
    public Result<AdminRoleMenuDTO> save(AdminRoleMenuDTO adminRoleMenu);

    public Result<List<AdminRoleMenuDTO>> updateList(Integer roleId, Map<String, List<Integer>> menusIds);
}
