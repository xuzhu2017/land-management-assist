package com.xz.landmangementassist.service;

import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminPermissionEntity;

/**
 * AdminPermissionService
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
public interface AdminPermissionService extends IService<AdminPermissionEntity> {
    /**
     * list
     * 
     * @return
     */
    public List<AdminPermissionDTO> listDTO();

    /**
     * 请求的api是否需要许可
     * 
     * @param requestAPI API requested by client
     * @return true when requestAPI is found in the DB
     */
    public boolean needFilter(String requestAPI);

    /**
     * 用户有权限访问的urls
     * 
     * @param username
     * @return
     */
    public Set<String> listPermissionURLsByUser(String username);
}
