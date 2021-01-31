package com.xz.landmangementassist.domain.entity.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.xz.landmangementassist.domain.entity.BaseEntity;

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
@Table(name = "admin_menu")
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
     * 图标样式(element-ui icons)
     */
    private String iconCls;

    /**
     * vue组件名
     */
    private String component;

    /**
     * 父菜单
     */
    private Integer parentId;
}
