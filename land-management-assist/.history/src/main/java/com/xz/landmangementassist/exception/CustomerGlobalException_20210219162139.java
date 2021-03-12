package com.xz.landmanagementassist.exception;

/**
 * BeanUtilException
 * 
 * @author xuzhu
 * @date 2021-2-19 13:57:28
 */
public class CustomerGlobalException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 621856737225186884L;

    public CustomerGlobalException(String message) {
        super(message);
    }

    public CustomerGlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}
