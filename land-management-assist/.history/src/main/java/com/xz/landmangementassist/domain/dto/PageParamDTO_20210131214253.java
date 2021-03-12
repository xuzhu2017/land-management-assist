package com.xz.landmanagementassist.domain.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 分页基础参数
 *
 * @author xuzhu
 * @date 2021-1-31 21:36:29
 */
@Data
public class PageParamDTO {

    /**
     * 页码
     */
    @NotNull(message = "分页参数不能为空")
    protected Integer pageNum;

    /**
     * 每页数量
     */
    @NotNull(message = "每页数量不能为空")
    @Max(value = 200, message = "每页最大为200")
    protected Integer pageSize;

    protected Boolean searchCount;

    protected List<OrderItemDTO> orders;

}
