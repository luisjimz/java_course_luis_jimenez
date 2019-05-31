package com.hibernate.luis.examen_2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter @Setter
public class EngineType extends DatabaseObject {
    @Column(name = "commercial_name")
    private String commercialName;

    @Column(name = "cylinder_number" )
    private String cylindersNumber;

    @Column(name = "cubic_measure")
    private String cubicMeasure;
}
