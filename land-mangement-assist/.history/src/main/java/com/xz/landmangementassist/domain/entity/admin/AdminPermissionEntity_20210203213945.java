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
 * 权限实体
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_admin_permission")
@EqualsAndHashCode(callSuper = true)
public class AdminPermissionEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -100109751899857476L;

    /**
     * 权限编码
     */
    private String code;

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

    /**
     * 逻辑删除
     */
    private boolean deleted;
}
