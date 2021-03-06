package com.xz.landmanagementassist.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 菜单DTO
 * 
 * @author xuzhu
 * @date 2021-1-29 13:00:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminMenuDTO {
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
    private int parentId;

    /**
     * 子菜单
     */
    private List<AdminMenuDTO> children;
}
