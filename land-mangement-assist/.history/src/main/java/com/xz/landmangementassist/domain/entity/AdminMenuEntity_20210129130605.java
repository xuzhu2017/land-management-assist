package com.xz.landmangementassist.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 菜单
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "admin_permission")
@EqualsAndHashCode(callSuper = true)
public class AdminMenuEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 3258458544798880222L;

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
