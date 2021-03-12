package com.xz.landmanagementassist.repository.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;

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

    // 普通CRUD都通过baseMapper配合QueryWrapper来查询
    // 特殊查询通过@select注解的方式实现
    List<Blog> selectByUserid(@Param("userid") String userid);
}
