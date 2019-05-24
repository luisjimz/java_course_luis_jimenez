package com.examen1.luisjimenez.examen1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Training {

    @Autowired
    private Person person;


    private String courseName;
    private List<Person> inscribed;

    public Training(){
    }

    public int inscribedTotal(){
        int x = this.inscribed.size();
        if(x >= 0){
            return x;
        }
        else{
            return 0;
        }
    }

    //Getters & Setters

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Person> getInscribed() {
        return inscribed;
    }

    public void setInscribed(List<Person> inscribed) {

        this.inscribed = inscribed;
    }
}

