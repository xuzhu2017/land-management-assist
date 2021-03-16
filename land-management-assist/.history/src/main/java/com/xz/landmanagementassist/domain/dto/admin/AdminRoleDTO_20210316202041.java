package com.xz.landmanagementassist.domain.dto.admin;

import com.xz.landmanagementassist.domain.dto.base.BaseDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
public class AdminRoleDTO extends BaseDTO {

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色名（中文）
     */
    private String nameZh;

    /**
     * 逻辑删除
     */
    private boolean deleted;

    /**
     * 角色拥有的权限
     */
    private List<AdminPermissionDTO> permissionList;

    /**
     * 角色拥有的菜单
     */
    private List<AdminMenuDTO> menuList;
}
