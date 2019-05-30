package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Person;
import com.examen1.luisjimenez.examen1.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private TrainingStorageService trainingStorageService;


    public EnrollmentService(){

    }

    public void enroll(Person person, Training training){
        TrainingStorageService trainingStorageService = new InMemoryTrainingStorageService();
        if(person == null || training == null) {
            return;
        }
        else{
            for (Person temp : training.getInscribed()) {
                if(temp.getName().equals(person.getName()) &&
                    temp.getLastName().equals(person.getLastName())){
                    return;
                }
            }
            List<Person> listaAlumnos = training.getInscribed();
            listaAlumnos.add(person);
            training.setInscribed(listaAlumnos);
            trainingStorageService.saveTraining(training);
        }
    }
}