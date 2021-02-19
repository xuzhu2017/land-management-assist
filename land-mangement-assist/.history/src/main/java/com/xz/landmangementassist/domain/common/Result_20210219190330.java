package com.xz.landmangementassist.domain.common;

import com.xz.landmangementassist.exception.BaseErrorInfo;
import com.xz.landmangementassist.exception.ErrorInfoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回前台结果
 * 
 * @author xuzhu
 * @date 2021-2-19 15:18:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    /**
     * 响应代码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;
    /**
     * success
     */
    private Boolean success;
    /**
     * 响应结果
     */
    private T data;

    public Result(BaseErrorInfo errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    /**
     * 成功
     *
     * @return
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 成功
     * 
     * @param data
     * @return
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(ErrorInfoEnum.SUCCESS.getResultCode());
        result.setMessage(ErrorInfoEnum.SUCCESS.getResultMsg());
        result.setData(data);
        return result;
    }

    /**
     * 失败
     */
    public static <T> Result<T> error(BaseErrorInfo errorInfo) {
        Result<T> result = new Result<T>();
        result.setCode(errorInfo.getResultCode());
        result.setMessage(errorInfo.getResultMsg());
        result.setData(null);
        return result;
    }

    /**
     * 失败
     */
    public static <T> Result<T> error(String code, String message) {
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    /**
     * 失败
     */
    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<T>();
        result.setCode("-1");
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
