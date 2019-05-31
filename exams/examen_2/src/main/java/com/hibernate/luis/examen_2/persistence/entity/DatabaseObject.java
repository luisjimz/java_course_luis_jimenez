package com.hibernate.luis.examen_2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter @Setter
public abstract class DatabaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    public DatabaseObject(){

    }

    public Long getId(){
        return this.id;
    }

    public void setId(final long id){
        this.id = id;
    }
}
