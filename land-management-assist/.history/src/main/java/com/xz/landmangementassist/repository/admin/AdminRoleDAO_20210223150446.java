package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
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
    @Select("<script>" + "select t_admin_menu.* " + "from t_admin_role_menu "
            + "inner join t_admin_menu on t_admin_role_menu.menu_id = t_admin_menu.id "
            + "where t_admin_role_menu.role_id in ("
            + "<foreach item='id' collection='roleIdList' open='(' separator=',' close=')'>" + "#{id}" + "</foreach>"
            + ")" + "</script>")
    List<AdminMenuDTO> getMenuListByRoleId(@Param("roleIdList") List<Integer> roleIdList);
}
