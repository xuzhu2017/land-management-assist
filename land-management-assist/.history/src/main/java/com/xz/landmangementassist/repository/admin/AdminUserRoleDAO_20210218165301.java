package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminUserRoleEntity;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 用户DAO
 * 
 * @author xuzhu
 * @date 2021-1-29 17:26:29
 */
@Mapper
@Component
public class AdminUserRoleDAO extends BaseMapper<AdminUserRoleEntity> {

}
