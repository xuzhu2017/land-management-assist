package com.xz.landmanagementassist.config;

import org.springframework.context.annotation.Configuration;

/**
 * MyWebMvcConfig
 * 
 * @author xuzhu
 * @date 2021-3-18 21:10:52
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 所有请求都允许跨域，使用这种配置方法就不能在 interceptor 中再配置 header 了
        registry.addMapping("/**").allowCredentials(true).allowedOrigins("http://localhost:8080")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE").allowedHeaders("*").maxAge(3600);
    }
}
