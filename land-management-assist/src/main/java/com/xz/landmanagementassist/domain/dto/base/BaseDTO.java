package com.xz.landmanagementassist.domain.dto.base;

import lombok.Data;

import java.util.Date;

/**
 * baseDTO
 * 
 * @author xuzhu
 * @date 2021-1-29 09:12:33
 */
@Data
public class BaseDTO {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;
}
