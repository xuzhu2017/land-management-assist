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

    /**
     * 错误码
     */
    protected String errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public CustomGlobalException() {
        super();
    }

    public CustomGlobalException(BaseErrorInfo errorInfo) {
        super(errorInfo.getResultCode());
        this.errorCode = errorInfo.getResultCode();
        this.errorMsg = errorInfo.getResultMsg();
    }

    public CustomGlobalException(BaseErrorInfo errorInfo, Throwable cause) {
        super(errorInfo.getResultCode(), cause);
        this.errorCode = errorInfo.getResultCode();
        this.errorMsg = errorInfo.getResultMsg();
    }

    public CustomGlobalException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public CustomGlobalException(String errorMsg, Throwable cause) {
        super(errorMsg, cause);
    }
}
