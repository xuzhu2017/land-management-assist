package com.xz.landmanagementassist.config;

import org.springframework.context.annotation.Configuration;

/**
 * ShiroConfiguration
 * 
 * @author xuzhu
 * @date 2021-3-18 15:24:04
 */
@Configuration
public class ShiroConfiguration {
    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/nowhere");

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        Map<String, Filter> customizedFilter = new HashMap<>(); // 自定义过滤器设置 1

        customizedFilter.put("url", getURLPathMatchingFilter()); // 自定义过滤器设置 2，命名，需在设置过滤路径前

        filterChainDefinitionMap.put("/api/authentication", "authc"); // 防鸡贼登录
        filterChainDefinitionMap.put("/api/menu", "authc");
        filterChainDefinitionMap.put("/api/admin/**", "authc");

        filterChainDefinitionMap.put("/api/admin/**", "url"); // 自定义过滤器设置 3，设置过滤路径

        shiroFilterFactoryBean.setFilters(customizedFilter); // 自定义过滤器设置 4，启用
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    public URLPathMatchingFilter getURLPathMatchingFilter() {
        return new URLPathMatchingFilter();
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getWJRealm());
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    public CookieRememberMeManager rememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        cookieRememberMeManager.setCipherKey("EVANNIGHTLY_WAOU".getBytes());
        return cookieRememberMeManager;
    }

    @Bean
    public SimpleCookie rememberMeCookie() {
        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        simpleCookie.setMaxAge(259200);
        return simpleCookie;
    }

    @Bean
    public WJRealm getWJRealm() {
        WJRealm wjRealm = new WJRealm();
        wjRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return wjRealm;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(2);
        return hashedCredentialsMatcher;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
