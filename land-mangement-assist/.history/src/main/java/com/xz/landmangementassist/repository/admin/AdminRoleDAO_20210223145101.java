package com.xz.landmangementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmangementassist.domain.entity.admin.AdminRoleEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 角色DAO
 * 
 * @author xuzhu
 * @date 2021-2-18 16:53:46
 */
@Mapper
@Component
public interface AdminRoleDAO extends BaseMapper<AdminRoleEntity> {
    @Select("select t_admin_menu.* " + "from t_admin_role_menu "
            + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
            + "where t_admin_role_menu.role_id = #{roleId}")
    List<AdminMenuEntity> getMenuListByRoleId(@Param("roleId") Integer roleId);
}
