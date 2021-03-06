package com.xz.landmanagementassist.exception;

import javax.servlet.http.HttpServletRequest;

import com.xz.landmanagementassist.domain.common.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义全局异常处理类
 * 
 * @author xuzhu
 * @date 2021-2-19 13:57:28
 */
@ControllerAdvice
public class CustomGlobalExceptionHandler<T> {

    private static final Logger logger = LoggerFactory.getLogger(CustomGlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * 
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = CustomGlobalException.class)
    @ResponseBody
    public Result<T> customExceptionHandler(HttpServletRequest req, CustomGlobalException e) {
        logger.error("发生业务异常！原因是：{}", e.getErrorMsg());
        return Result.error(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     * 
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public Result<T> exceptionHandler(HttpServletRequest req, NullPointerException e) {
        logger.error("发生空指针异常！原因是:", e);
        return Result.error(CommonEnum.BODY_NOT_MATCH);
    }

    /**
     * 处理其他异常
     * 
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("未知异常！原因是:", e);
        return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }
}
