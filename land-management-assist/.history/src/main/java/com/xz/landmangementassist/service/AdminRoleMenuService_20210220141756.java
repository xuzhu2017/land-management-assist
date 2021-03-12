package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
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
    public Result<List<AdminRoleMenuDTO>> getListByRoleId(Integer roleId);

    /**
     * 根据角色IdList获取List<AdminRoleMenuDTO>
     * 
     * @param roleIdList
     * @return
     */
    public Result<List<AdminRoleMenuDTO>> getListByRoleIdList(List<Integer> roleIdList);
}
