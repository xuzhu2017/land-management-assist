package com.xz.landmanagementassist.domain.dto.admin;

import com.xz.landmanagementassist.domain.dto.base.BaseDTO;
import com.xz.landmanagementassist.domain.dto.base.OutputConverter;
import com.xz.landmanagementassist.domain.entity.admin.AdminRolePermissionEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 角色-权限关联DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 11:04:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class AdminRolePermissionDTO extends BaseDTO {
    /**
     * Role id.
     */
    private Integer roleId;

    /**
     * Permission id.
     */
    private Integer permissionId;
}
