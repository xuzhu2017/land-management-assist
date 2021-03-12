package com.xz.landmanagementassist.domain.dto;

import lombok.Data;

/**
 * 排序
 * 
 * @author xuzhu
 * @date 2021-1-31 21:38:51
 */
@Data
public class OrderItemDTO {

    /**
     * 排序列名
     */
    private String column;
    /**
     * 升序/降序（默认升序）
     */
    private boolean asc = true;
}
