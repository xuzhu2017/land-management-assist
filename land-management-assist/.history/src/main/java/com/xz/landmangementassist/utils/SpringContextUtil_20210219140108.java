package com.xz.landmanagementassist.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * SpringContextUtil
 * 
 * @author xuzhu
 * @date 2021-2-19 13:37:14
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringContextUtil.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}