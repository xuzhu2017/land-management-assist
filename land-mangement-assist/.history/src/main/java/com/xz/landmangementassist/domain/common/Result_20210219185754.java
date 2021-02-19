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

    // /**
    // * 成功
    // *
    // * @return
    // */
    // public static Result success() {
    // return success(null);
    // }

    /**
     * 成功
     * 
     * @param data
     * @return
     */
    public static Result success(T data) {
        Result rb = new Result();
        rb.setCode(ErrorInfoEnum.SUCCESS.getResultCode());
        rb.setMessage(ErrorInfoEnum.SUCCESS.getResultMsg());
        rb.setData(data);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error(BaseErrorInfo errorInfo) {
        Result rb = new Result();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setData(null);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error(String code, String message) {
        Result rb = new Result();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error(String message) {
        Result rb = new Result();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }

    // @Override
    // public String toString() {
    // return JSONObject.toJSONString(this);
    // }

}
