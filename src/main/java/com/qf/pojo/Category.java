package com.qf.pojo;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    @Column(name = "cate_name")
    private String cateName;

    private Integer level;

    private Integer parent;

    private String pic;
}
