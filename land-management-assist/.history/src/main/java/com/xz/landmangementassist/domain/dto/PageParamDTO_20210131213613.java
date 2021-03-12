package com.xz.landmanagementassist.domain.dto;

public class PageParamDTO {

    @NotNull(message = "分页参数不能为空")
    protected Integer pageNum;

    @NotNull(message = "每页数量不能为空")
    @Max(value = 200, message = "每页最大为200")
    protected Integer pageSize;

    protected Boolean searchCount;

    protected List<OrderItemDTO> orders;

}
