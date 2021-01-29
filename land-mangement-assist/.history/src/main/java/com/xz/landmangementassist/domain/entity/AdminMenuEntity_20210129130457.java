package com.xz.landmangementassist.domain.entity;

/**
 * 菜单
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
public class AdminMenuEntity {
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
