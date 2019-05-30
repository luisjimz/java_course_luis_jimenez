package com.springhibernate.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter
public class Address extends DatabaseObject {
    private String streetName;
    private Integer streetNumber;
    private String floor;
    private String neighborhood;
    private String city;
    private String country;
    private String reference;
}
