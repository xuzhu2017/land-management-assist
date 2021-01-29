package com.xz.landmangementassist.domain.entity;

import lombok.Data;

import java.util.Date;

import javax.persistence.*;

/**
 * baseEntity
 * @author xuzhu
 * 
 */
@Data
public class BaseEntity {
    /**
     * 主键Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;
}
