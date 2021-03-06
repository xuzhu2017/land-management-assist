package com.xz.landmanagementassist.domain.entity;

import lombok.Data;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * baseEntity
 * 
 * @author xuzhu
 * @date 2021-1-29 09:12:33
 */
@Data
public class BaseEntity {
    /**
     * 主键Id
     */
    @TableId(type = IdType.AUTO)
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
