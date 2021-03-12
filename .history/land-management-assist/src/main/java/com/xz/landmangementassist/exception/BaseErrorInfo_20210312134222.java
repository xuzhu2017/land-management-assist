package com.xz.landmanagementassist.exception;

/**
 * 错误信息接口
 * 
 * @author xuzhu
 * @date 2021-2-19 16:24:20
 */
public interface BaseErrorInfo {

    /**
     * 错误码
     */
    String getResultCode();

    /**
     * 错误描述
     */
    String getResultMsg();
}
