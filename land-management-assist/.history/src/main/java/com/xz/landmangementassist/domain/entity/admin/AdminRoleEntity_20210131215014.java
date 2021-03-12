package com.xz.landmanagementassist.domain.entity.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 角色实体
 * 
 * @author xuzhu
 * @date 2021-1-29 10:30:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "admin_role")
@EqualsAndHashCode(callSuper = true)
public class AdminRoleEntity extends BaseEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3832918797553983514L;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色名（中文）
     */
    @Column(name = "name_zh")
    private String nameZh;

    /**
     * 角色状态
     */
    private boolean enabled;

}
