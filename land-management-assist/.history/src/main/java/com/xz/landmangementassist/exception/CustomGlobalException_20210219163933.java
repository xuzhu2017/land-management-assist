package com.xz.landmanagementassist.exception;

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

    public CustomGlobalException(BaseErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getResultCode());
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public CustomGlobalException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getResultCode(), cause);
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public CustomGlobalException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public CustomGlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}
