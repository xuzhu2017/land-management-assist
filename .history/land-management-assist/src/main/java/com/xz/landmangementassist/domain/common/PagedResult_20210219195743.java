package com.xz.landmangementassist.domain.common;

import lombok.Data;

import java.util.List;

/**
 * Page返回对象
 *
 * @Author xuzhu
 * @Date 2021-2-19 19:57:38
 */
@Data
public class PagedResult<T> {
    /**
     * 当前页
     */
    private Long pageNum;

    /**
     * 每页的数量
     */
    private Long pageSize;

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 总页数
     */
    private Long pages;

    /**
     * 结果集
     */
    private List<T> list;
}
