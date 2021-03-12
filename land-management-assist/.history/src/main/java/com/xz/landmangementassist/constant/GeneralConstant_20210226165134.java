package com.xz.landmanagementassist.constant;

/**
 * 通用常量
 * 
 * @author xuzhu
 * @date 2021-2-22 14:36:41
 */
public interface GeneralConstant {
    /**
     * 空主键ID，0
     */
    Integer EMPTY_ID = 0;
    /**
     * 用户初始化密码
     */
    String DEFAULT_PASSWORD = "123456";
    /**
     * 加密算法
     */
    String ALGORITHM_NAME = "md5";
    /**
     * 哈希迭代次数
     */
    int HASH_ITERATIONS = 2;
}
