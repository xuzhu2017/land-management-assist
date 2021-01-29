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
 * 菜单实体
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
     * 菜单路由
     */
    private String path;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单名称（中文）
     */
    private String nameZh;

    /**
     * 图标样式
     */
    private String iconCls;

    /**
     * Front-end component name corresponding to menu.
     */
    private String component;

    /**
     * Parent menu.
     */
    private int parentId;
}
