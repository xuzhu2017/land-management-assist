package com.xz.landmangementassist.domain.entity;

import lombok.Data;
import javax.persistence.*;

@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
}
