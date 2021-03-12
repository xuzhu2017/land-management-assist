package com.xz.landmanagementassist.repository.admin;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 用户DAO
 * 
 * @author xuzhu
 * @date 2021-1-29 17:26:29
 */
@Mapper
@Component
public interface UserDAO extends BaseMapper<UserEntity> {

    // TODO: xuzhu：1.研究一下MyBatis的条件构造器构造器wrapper如何使用
    // 2.以及给分页的泛型指定是否有效
    List<UserDTO> selectEmployeeList(Page<UserDTO> page, @Param("queryDTO") UserQueryDTO queryDTO);
}
