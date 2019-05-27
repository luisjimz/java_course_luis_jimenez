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
        if(this.getInscribed() == null){
            return 0;
        }
        else{
            return this.getInscribed().size();
        }
    }

    @Override
    public String toString(){
        String miCadena = "Course name: " + this.courseName + "\n";
        miCadena += "Students:";
        for(int i = 0; i < this.getInscribed().size(); i++){
//            miCadena += "\nStudent #" + i+1 + ": " + this.getInscribed().get(i);
            miCadena += "\n" + this.getInscribed().get(i);
        }
        return miCadena;
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

