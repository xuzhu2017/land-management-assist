package com.xz.landmanagementassist.domain.common;

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
public class PageParam {

    public PageParam(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    /**
     * 页码
     */
    @NotNull(message = "分页参数不能为空")
    protected Integer pageNum;

    /**
     * 每页数量
     */
    @NotNull(message = "每页数量不能为空")
    @Max(value = 1000, message = "每页最大为1000")
    protected Integer pageSize;

    /**
     * 是否查询总数
     */
    protected Boolean searchCount;

    /**
     * 排序
     */
    protected List<OrderItem> orders;

}
