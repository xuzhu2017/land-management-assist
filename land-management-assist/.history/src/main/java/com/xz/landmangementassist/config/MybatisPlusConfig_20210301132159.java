package com.xz.landmanagementassist.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuzhu
 * @date 2021-2-19 09:44:32
 */
@Configuration
@MapperScan("com.xz.landmanagementassist.repository.admin")
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
        return interceptor;
    }
}
