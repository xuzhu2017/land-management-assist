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

    public CustomGlobalException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public CustomGlobalException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getMessage() {
        return errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
