package com.springhibernate.demo.persistence.entity;

import com.springhibernate.demo.model.AcademicStatus;
import com.springhibernate.demo.model.SexoStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Sexo extends DatabaseObject  {

    @Column(name="sexo", nullable = false)
    private String sexo;

    public Sexo(){
    }
}
