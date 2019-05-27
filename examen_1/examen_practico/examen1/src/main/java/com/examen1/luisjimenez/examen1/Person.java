package com.examen1.luisjimenez.examen1;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private String lastName;

    public Person(){
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getName() + "\nApellido: " + this.getLastName();
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
