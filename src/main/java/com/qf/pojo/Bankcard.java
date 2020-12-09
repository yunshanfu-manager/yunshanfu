package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.metamodel.IdentifiableType;

@Data
@Entity
@Table(name = "bank_card")
public class Bankcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "bank_name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @Column(name = "description")
    private String description;
    @Column(name = "num")
    private double num;
    @Column(name = "for")
    private String forr;
    @Column(name = "img")
    private String img;

}
