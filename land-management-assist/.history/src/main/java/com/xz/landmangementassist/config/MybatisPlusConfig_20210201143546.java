package com.xz.landmanagementassist.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MybatisPlus配置
 * 
 * @author xuzhu
 * @date 2021-2-1 14:32:04
 */
@EnableTransactionManagement // 开启注解事务管理
@Configuration
@MapperScan("com.xz.landmanagementassist.repository.admin") // 扫描dao（Mapper），自动实现接口
public class MybatisPlusConfig {

}
