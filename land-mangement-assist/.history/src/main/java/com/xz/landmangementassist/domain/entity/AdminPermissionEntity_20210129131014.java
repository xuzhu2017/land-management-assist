package com.xz.landmangementassist.domain.entity;

public class AdminPermissionEntity extends BaseEntity implements Serializable {
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
