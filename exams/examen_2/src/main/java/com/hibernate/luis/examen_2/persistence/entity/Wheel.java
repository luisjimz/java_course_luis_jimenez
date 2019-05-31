package com.hibernate.luis.examen_2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Wheel extends DatabaseObject{
    private String brand;
}
