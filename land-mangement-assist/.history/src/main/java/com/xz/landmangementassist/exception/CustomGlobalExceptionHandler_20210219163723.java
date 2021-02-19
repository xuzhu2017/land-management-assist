package com.xz.landmangementassist.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 自定义全局异常处理类
 * 
 * @author xuzhu
 * @date 2021-2-19 13:57:28
 */
@ControllerAdvice
public class CustomGlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e) {
        System.out.println("未知异常！原因是:" + e);
        return e.getMessage();
    }
}
