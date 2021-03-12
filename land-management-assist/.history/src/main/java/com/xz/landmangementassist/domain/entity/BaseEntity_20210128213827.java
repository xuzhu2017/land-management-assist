package com.xz.landmanagementassist.domain.entity;

import lombok.Data;

@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
}
