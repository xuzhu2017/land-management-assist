package com.xz.landmangementassist.domain.entity;

import lombok.Data;

import java.util.Date;

import javax.persistence.*;

/**
 * baseEntity
 * @author xuzhu
 * @date 2021-1-29 09:12:33
 */
@Data
public class BaseEntity {
    /**
     * 主键Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
