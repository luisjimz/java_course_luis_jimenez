package com.springhibernate.demo.persistence.entity;

import com.springhibernate.demo.model.AcademicStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter @Setter
public class Student extends DatabaseObject {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(name = "academic_status")
    private AcademicStatus academicStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Column
    private String columnaDePrueba;

    @Column(name = "uuid", nullable = false, updatable = false)
    private String uniqueId;

    public Student(String firstName, String lastName, String email, Integer age, String uuid, AcademicStatus academicStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.uniqueId = uuid;
        this.academicStatus = academicStatus;
    }

    public Student(String firstName, String lastName, String email, Integer age, String uuid) {
        this(firstName, lastName, email, age, uuid, AcademicStatus.REGULAR);
    }

    public Student(String firstName, String lastName, String email, String uuid) {
        this(firstName, lastName, email, null, uuid);
    }

    public Student() {
    }
}
