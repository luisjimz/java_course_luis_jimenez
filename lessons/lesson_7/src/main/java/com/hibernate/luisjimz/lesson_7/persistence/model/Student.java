package com.hibernate.luisjimz.lesson_7.persistence.model;

import javax.persistence.*;

@Entity
@Table(name="tabla_estudiante")
public class Student extends DatabaseObject {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

//    @Column(name="condition")
//    @Enumerated(EnumType.STRING)
//    private ConditionEnum condition;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    public ConditionEnum getCondition() {
//        return condition;
//    }
//
//    public void setCondition(ConditionEnum condition) {
//        this.condition = condition;
//    }

}
