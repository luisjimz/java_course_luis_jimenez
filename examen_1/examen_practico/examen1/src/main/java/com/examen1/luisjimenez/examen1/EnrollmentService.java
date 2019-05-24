package com.examen1.luisjimenez.examen1;

import com.examen1.luisjimenez.examen1.service.TrainingStorageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

public class EnrollmentService {

    @Autowired
    private TrainingStorageService myService;

    @Autowired
    private Person person;

    @Autowired
    private Training training;

    public EnrollmentService(){
    }

    public void inscription(Person person, Training training) {

        if (person == null || training == null) {
            return;
        }
        else{
            List<Person> actualPerson = new LinkedList<>();
            actualPerson = training.getInscribed();
            actualPerson.add(person);
            training.setInscribed(actualPerson);
        }
    }
}
