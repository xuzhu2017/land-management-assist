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
 * 角色实体
 * 
 * @author xuzhu
 * @date 2021-1-29 10:30:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_admin_role")
@EqualsAndHashCode(callSuper = true)
public class AdminRoleEntity extends BaseEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3832918797553983514L;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色名（中文）
     */
    private String name;

    /**
     * 逻辑删除
     */
    private boolean deleted;

}
