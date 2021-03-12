package com.xz.landmanagementassist.domain.enums;

import java.util.Objects;

/**
 * @author xuzhu
 * @date 2021-2-19 16:05:22
 */
public interface BaseEnum {

    /**
     * 获取枚举类的值
     *
     * @return Object
     */
    Object getValue();

    /**
     * 获取枚举类的说明
     *
     * @return String
     */
    String getDesc();

    /**
     * 比较参数是否与枚举类的value相同
     *
     * @param value
     * @return boolean
     */
    default boolean equalsValue(Object value) {
        return Objects.equals(getValue(), value);
    }

    /**
     * 比较枚举类是否相同
     *
     * @param baseEnum
     * @return boolean
     */
    default boolean equals(BaseEnum baseEnum) {
        return Objects.equals(getValue(), baseEnum.getValue()) && Objects.equals(getDesc(), baseEnum.getDesc());
    }

}
