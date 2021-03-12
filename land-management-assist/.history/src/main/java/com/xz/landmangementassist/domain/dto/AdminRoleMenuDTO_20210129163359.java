package com.xz.landmanagementassist.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色菜单关联DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 11:04:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminRoleMenuDTO {
    /**
     * Role id.
     */
    private int roleId;

    /**
     * Menu id.
     */
    private int memuId;
}
