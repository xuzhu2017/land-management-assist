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
        /**
         * 获取当前用户的菜单
         * 
         * @param username
         * @return
         */
        @Select("select t_admin_menu.* " + "from t_admin_user_role "
                        + "inner join t_admin_role_menu on t_admin_user_role.role_id = t_admin_role_menu.role_id "
                        + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
                        + "inner join t_admin_user on t_admin_user_role.user_id = t_admin_user.id "
                        + "where t_admin_user.username = #{username}")
        List<AdminMenuEntity> getMenuListByCurrentUser(@Param("username") String username);
        // TODO: xuzhu 参数传递有问题，参数无法拼接到sql字符串里面

        /**
         * 获取角色菜单
         * 
         * @param roleId
         * @return
         */
        @Select("select t_admin_menu.* " + "from t_admin_role_menu "
                        + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
                        + "where t_admin_role_menu.role_id = #{roleId}")
        List<AdminMenuEntity> getMenuListByRoleId(@Param("roleId") Integer roleId);
}
