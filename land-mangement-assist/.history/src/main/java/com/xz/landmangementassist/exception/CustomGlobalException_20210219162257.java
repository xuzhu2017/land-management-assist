package com.xz.landmangementassist.exception;

/**
 * 全局异常处理的自定义异常类
 * 
 * @author xuzhu
 * @date 2021-2-19 13:57:28
 */
public class CustomGlobalException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 621856737225186884L;

    public CustomGlobalException(String message) {
        super(message);
    }

    public CustomGlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}