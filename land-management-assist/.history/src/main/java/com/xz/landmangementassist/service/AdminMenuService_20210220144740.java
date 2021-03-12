package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;

/**
 * AdminMenuService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminMenuService {
    /**
     * 获取子菜单列表
     * 
     * @param parentId
     * @return
     */
    public List<AdminMenuDTO> getListByParentId(int parentId);
}
