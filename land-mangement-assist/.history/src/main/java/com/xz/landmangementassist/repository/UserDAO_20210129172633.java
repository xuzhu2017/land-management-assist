package com.xz.landmangementassist.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmangementassist.domain.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;
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

}
