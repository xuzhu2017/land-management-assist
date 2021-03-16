package com.xz.landmanagementassist.utils;

import com.xz.landmanagementassist.exception.BaseErrorInfo;
import com.xz.landmanagementassist.exception.CustomGlobalException;

/**
 * 断言
 * 
 * @author xuzhu
 * @date 2021-3-16 21:30:18
 */
public class MyAssert {
    /**
     * boolean判断，boolean假时抛出异常
     * 
     * @param expression
     * @param errorInfo
     */
    public static void isTrue(boolean expression, BaseErrorInfo errorInfo) {
        if (!expression) {
            throw new CustomGlobalException(errorInfo);
        }
    }
}
