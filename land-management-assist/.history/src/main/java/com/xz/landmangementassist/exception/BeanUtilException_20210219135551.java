package com.xz.landmanagementassist.exception;

public class BeanUtilException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 621856737225186884L;

    public BeanUtilException(String message) {
        super(message);
    }

    public BeanUtilException(String message, Throwable cause) {
        super(message, cause);
    }
}
