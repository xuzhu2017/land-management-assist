package com.xz.landmangementassist.domain.dto;

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
public class AdminUserRoleDTO extends BaseDTO {
    /**
     * User id.
     */
    private int userId;

    /**
     * Role id.
     */
    private int roleId;

}
