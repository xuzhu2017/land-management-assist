package com.xz.landmangementassist.domain.dto.admin;

import com.xz.landmangementassist.domain.dto.base.BaseDTO;
import com.xz.landmangementassist.domain.dto.base.OutputConverter;
import com.xz.landmangementassist.domain.entity.admin.AdminRoleMenuEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 角色-菜单关联DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 11:04:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class AdminRoleMenuDTO extends BaseDTO implements OutputConverter<AdminRoleMenuDTO, AdminRoleMenuEntity> {
    /**
     * Role id.
     */
    private Integer roleId;

    /**
     * Menu id.
     */
    private Integer memuId;
}
