package com.springhibernate.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter @Setter @MappedSuperclass
abstract class DatabaseObject extends TimeStampedObject{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
}
