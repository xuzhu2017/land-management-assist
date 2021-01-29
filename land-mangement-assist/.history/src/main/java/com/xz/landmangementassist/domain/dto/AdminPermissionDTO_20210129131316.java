package com.xz.landmangementassist.domain.dto;

/**
 * 权限
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminPermissionDTO {
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
