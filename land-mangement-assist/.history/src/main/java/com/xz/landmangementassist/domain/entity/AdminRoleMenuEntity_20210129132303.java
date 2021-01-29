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
@Table(name = "admin_menu")
@EqualsAndHashCode(callSuper = true)
public class AdminRoleMenuEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -9085680868413146608L;

    /**
     * Role id.
     */
    private int roleId;

    /**
     * Menu id.
     */
    private int memuId;
}
