package com.examen1.luisjimenez.examen1;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private String lastName;

    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
