package com.xz.landmangementassist.utils;

import com.alibaba.fastjson.serializer.ClobSeriliazer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.landmangementassist.domain.dto.query.IQuery;

/**
 * MyBatisPlus查询条件构造器工具类 使用前台传入的查询实体生成条件构造器
 * 
 * @author xuzhu
 * @date 2021-2-1 15:53:17
 */
public class QueryWrapperUtil {
    // TODO:xuzhu：研究一下如何通过反射来设计一个泛型的静态方法来解析前台的dto的属性，并且生成查询的构造器，包括时间范围，逻辑删除

    public static <T, Q extends IQuery> QueryWrapper<T> createQuery(Q queryDTO, Class<T> entity) {
        QueryWrapper<entity> queryWrapper = new QueryWrapper();
    }
}
