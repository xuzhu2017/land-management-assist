package com.xz.landmanagementassist.domain.dto.admin;

import com.xz.landmanagementassist.domain.dto.base.BaseDTO;
import com.xz.landmanagementassist.domain.dto.base.OutputConverter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 权限DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class AdminPermissionDTO extends BaseDTO implements OutputConverter<AdminPermissionDTO, AdminRoleEntity> {
    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 触发权限的url
     */
    private String url;

}
