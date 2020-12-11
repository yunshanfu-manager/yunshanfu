package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @Column(name = "distance")
    private String distance;
    @Column(name = "activity")
    private String activity;
    @Column(name = "activ")
    private String activ;
    @Column(name = "img")
    private String img;
}
