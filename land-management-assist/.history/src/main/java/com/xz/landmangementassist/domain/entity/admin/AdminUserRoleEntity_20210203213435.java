package com.xz.landmanagementassist.domain.entity.admin;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xz.landmanagementassist.domain.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户-角色关联实体
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_admin_user_role")
@EqualsAndHashCode(callSuper = true)
public class AdminUserRoleEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -7407546322491313519L;

    /**
     * User id.
     */
    private int userId;

    /**
     * Role id.
     */
    private int roleId;

}
