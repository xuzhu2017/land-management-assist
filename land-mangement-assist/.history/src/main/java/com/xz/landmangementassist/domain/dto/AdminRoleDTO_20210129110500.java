package com.xz.landmangementassist.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色实体
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

    private List<AdminPermission> perms;
}
