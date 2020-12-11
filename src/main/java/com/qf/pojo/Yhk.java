package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bank_yhk")
public class Yhk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "img")
    private String img;
    @Column(name = "favourable")
    private String favourable;
    @Column(name = "card")
    private String card;
    @Column(name = "icon")
    private String icon;
}
