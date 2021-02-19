package com.xz.landmangementassist.domain.dto.admin;

import com.xz.landmangementassist.domain.dto.base.BaseDTO;
import com.xz.landmangementassist.domain.dto.base.OutputConverter;
import com.xz.landmangementassist.domain.entity.admin.AdminUserRoleEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户-角色关联DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 11:04:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class AdminUserRoleDTO extends BaseDTO implements OutputConverter<AdminUserRoleDTO, AdminUserRoleEntity> {
    /**
     * User id.
     */
    private int userId;

    /**
     * Role id.
     */
    private int roleId;

}
