package com.xz.landmangementassist.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 11:04:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminRoleDTO {

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色名（中文）
     */
    private String nameZh;

    /**
     * 角色状态
     */
    private boolean enabled;

    /**
     * 角色拥有的权限
     */
    private List<AdminPermissionDTO> permissionList;

    /**
     * 角色拥有的菜单
     */
    private List<AdminMenuDTO> menuList;
}
