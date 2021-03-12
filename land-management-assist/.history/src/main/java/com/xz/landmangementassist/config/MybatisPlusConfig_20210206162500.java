package com.xz.landmanagementassist.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * MybatisPlus配置
 * 
 * @author xuzhu
 * @date 2021-2-1 14:32:04
 */
@Configuration
@MapperScan("com.xz.landmanagementassist.repository.admin") // 扫描dao（Mapper），自动实现接口
public class MybatisPlusConfig {

}
