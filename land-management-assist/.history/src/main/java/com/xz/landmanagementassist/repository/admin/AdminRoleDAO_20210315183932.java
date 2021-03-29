package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
        /**
         * 获取角色对应菜单
         * 
         * @param roleIdList
         * @return
         */
        @Select("<script>" + "select t_admin_menu.*,t_admin_role_menu.role_id  " + "from t_admin_role_menu "
                        + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
                        + "where t_admin_role_menu.role_id in ("
                        + "<foreach item='id' collection='roleIdList' open='(' separator=',' close=')'>" + "#{id}"
                        + "</foreach>" + ")" + "</script>")
        List<AdminMenuDTO> getMenuListByRoleId(@Param("roleIdList") List<Integer> roleIdList);

        /**
         * 获取角色对应权限
         * 
         * @param roleIdList
         * @return
         */
        @Select("<script>" + "select t_admin_permission.*,t_admin_role_permission.role_id  "
                        + "from t_admin_permission "
                        + "inner join t_admin_role_permission on t_admin_permission.permission_id = t_admin_role_permission.id "
                        + "where t_admin_role_permission.role_id in ("
                        + "<foreach item='id' collection='roleIdList' open='(' separator=',' close=')'>" + "#{id}"
                        + "</foreach>" + ")" + "</script>")
        List<AdminPermissionDTO> getPermissionListByRoleId(@Param("roleIdList") List<Integer> roleIdList);

        /**
         * 获取当前用户的角色
         * 
         * @param username
         * @return
         */
        @Select("select t_admin_role.* " + "from t_admin_role "
                        + "inner join t_admin_user_role on t_admin_role.id = t_admin_user_role.role_id "
                        + "inner join t_admin_user on t_admin_user_role.user_id = t_admin_user.id "
                        + "where t_admin_user.username = #{username}")
        List<AdminRoleDTO> getListByUsername(@Param("username") String username);
}
