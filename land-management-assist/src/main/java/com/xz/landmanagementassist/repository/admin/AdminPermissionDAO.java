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
    /**
     * 根据用户名获取权限
     * 
     * @param username
     */
    @Select("select t_admin_permission.* " + "from t_admin_permission "
            + "inner join t_admin_role_permission on t_admin_permission.id = t_admin_role_permission.permission_id "
            + "inner join t_admin_user_role on t_admin_role_permission.role_id = t_admin_user_role.role_id "
            + "inner join t_admin_user on t_admin_user_role.user_id = t_admin_user.id "
            + "where t_admin_user.username = #{username} and t_admin_user.deleted = 0")
    List<AdminPermissionEntity> getListByUsername(@Param("username") String username);
}
