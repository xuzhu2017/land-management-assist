package com.xz.landmanagementassist.domain.common;

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

    private String code;

    private String msg;

    private Boolean success;

    private T data;
}
