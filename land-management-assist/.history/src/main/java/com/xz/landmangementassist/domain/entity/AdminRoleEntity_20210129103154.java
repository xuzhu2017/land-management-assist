package com.xz.landmanagementassist.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * 角色
 * 
 * @author xuzhu
 * @date 2021-1-29 10:30:43
 */
public class AdminRoleEntity extends BaseEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3832918797553983514L;

    /**
     * Role name.
     */
    private String name;

    /**
     * Role name in Chinese.
     */
    @Column(name = "name_zh")
    private String nameZh;

    /**
     * Role status.
     */
    private boolean enabled;

}
