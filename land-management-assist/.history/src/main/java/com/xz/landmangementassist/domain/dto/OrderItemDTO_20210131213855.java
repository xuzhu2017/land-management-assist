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

    private String column;
    private boolean asc = true;
}
