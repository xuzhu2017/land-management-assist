package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.entity.admin.AdminMenuEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 菜单DAO
 * 
 * @author xuzhu
 * @date 2021-2-18 16:53:46
 */
@Mapper
@Component
public interface AdminMenuDAO extends BaseMapper<AdminMenuEntity> {
    @Select("select t_admin_menu.* " + "from t_admin_user_role "
            + "inner join t_admin_role_menu on t_admin_user_role.role_id = t_admin_role_menu.role_id "
            + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id where id = #{userQueryDTO.id}")
    List<AdminMenuEntity> getMenuListByCurrentUser(@Param("username") String username);
}
