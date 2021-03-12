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
 * 菜单实体
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_admin_menu")
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
     * 菜单编码
     */
    private String code;

    /**
     * 菜单名称（中文）
     */
    private String name;

    /**
     * 图标样式(element-ui icons)
     */
    private String iconCls;

    /**
     * vue组件名
     */
    private String component;

    /**
     * 父菜单id
     */
    private Integer parentId;
}
