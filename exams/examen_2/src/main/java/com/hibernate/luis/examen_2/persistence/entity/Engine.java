package com.hibernate.luis.examen_2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter @Setter
public class Engine extends DatabaseObject {

    @Column(name = "brand_name")
    private String brandName;

    @OneToMany
    private List<EngineType> engineType;

}
