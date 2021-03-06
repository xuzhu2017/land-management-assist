package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.entity.admin.AdminPermissionEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 权限DAO
 * 
 * @author xuzhu
 * @date 2021-2-18 16:53:46
 */
@Mapper
@Component
public interface AdminPermissionDAO extends BaseMapper<AdminPermissionEntity> {
    @Select("select t_admin_permission.* " + "from t_admin_permission "
            + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
            + "where t_admin_role_menu.role_id = #{roleId}")
    List<AdminPermissionEntity> getListByUsername(@Param("username") String username);
}
