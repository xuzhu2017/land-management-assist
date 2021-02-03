package com.xz.landmangementassist.domain.entity.admin;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xz.landmangementassist.domain.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 角色-菜单关联实体
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_admin_role_menu")
@EqualsAndHashCode(callSuper = true)
public class AdminRoleMenuEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -9085680868413146608L;

    /**
     * Role id.
     */
    private Integer roleId;

    /**
     * Menu id.
     */
    private Integer memuId;
}
