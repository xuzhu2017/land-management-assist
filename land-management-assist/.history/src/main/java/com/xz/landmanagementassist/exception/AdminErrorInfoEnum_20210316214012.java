package com.xz.landmanagementassist.exception;

public enum AdminErrorInfoEnum implements BaseErrorInfo {
    /**
     * 该用户已被禁用！
     */
    LOGIN_USERDELETE_ERROR("700", "该用户已被禁用！"),
    /**
     * 密码错误！
     */
    LOGIN_PWD_ERROR("701", "密码错误！"),
    /**
     * 账号不存在！
     */
    LOGIN_USERNOTFOUND_ERROR("702", "账号不存在！"),
    /**
     * 用户名和密码不能为空！
     */
    REGISTER_USERNAMEPWDEMPTY_ERROR("703", "用户名和密码不能为空！"),
    /**
     * 用户已存在！
     */
    REGISTER_USEREXIST_ERROR("704", "用户已存在！");

    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    AdminErrorInfoEnum(String resultCode, String resultMsg) {
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
