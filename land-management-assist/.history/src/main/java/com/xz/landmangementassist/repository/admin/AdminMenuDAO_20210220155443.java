package com.xz.landmanagementassist.repository.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.entity.admin.AdminMenuEntity;

import org.apache.ibatis.annotations.Mapper;
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

}
