package com.hibernate.luis.examen_2.persistence.entity;

import com.hibernate.luis.examen_2.model.SegmentCategory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class Vehicle extends DatabaseObject{

    @Column(name = "model")
    private String model;

    @Column(name = "version")
    private String version;

    @Column(name = "segment_category")
    @Enumerated(EnumType.STRING)
    private SegmentCategory segmentCategory;

    @Column(name = "year_model")
    private Integer yearModel;

    @Column(name = "number_doors")
    private String numberOfDoors;

    @OneToOne(cascade = CascadeType.ALL)
    private Wheel wheel;

    @OneToOne(cascade =  CascadeType.ALL)
    private Engine engine;


}