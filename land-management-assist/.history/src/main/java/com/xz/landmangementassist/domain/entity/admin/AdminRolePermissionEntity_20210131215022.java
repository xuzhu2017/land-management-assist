package com.xz.landmanagementassist.domain.entity.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 角色-权限关联实体
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "admin_role_permission")
@EqualsAndHashCode(callSuper = true)
public class AdminRolePermissionEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 8195939989818471420L;

    /**
     * Role id.
     */
    private Integer roleId;

    /**
     * Permission id.
     */
    private Integer permissionId;
}
