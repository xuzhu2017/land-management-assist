package com.xz.landmanagementassist.domain.dto;

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
