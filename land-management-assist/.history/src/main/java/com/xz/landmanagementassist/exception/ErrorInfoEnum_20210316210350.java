package com.xz.landmanagementassist.exception;

/**
 * 异常信息枚举
 * 
 * @author xuzhu
 * @date 2021-2-19 16:24:20
 */
public enum ErrorInfoEnum implements BaseErrorInfo {
    // 数据操作错误定义
    SUCCESS("200", "成功!"), BODY_NOT_MATCH("400", "请求的数据格式不符!"), SIGNATURE_NOT_MATCH("401", "请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"), INTERNAL_SERVER_ERROR("500", "服务器内部错误!"), SERVER_BUSY("503", "服务器正忙，请稍后再试!"),
    DTO_TRANSFORM_ERROR("600", "实体转DTO发生错误!"), DTO_UPDATE_ERROR("601", "实体更新DTO发生错误!"),
    LOGIN_USERDELETE_ERROR("700", "该用户已被禁用!"), LOGIN_PWD_ERROR("701", "密码错误!"),
    // 账号不存在!
    LOGIN_USERNOTFOUND_ERROR("702", "账号不存在!");

    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    ErrorInfoEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
