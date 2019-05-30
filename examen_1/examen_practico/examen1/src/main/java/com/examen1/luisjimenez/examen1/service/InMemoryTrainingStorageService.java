package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryTrainingStorageService implements TrainingStorageService {


    @Autowired
    private List<Training> trainingList;

    public InMemoryTrainingStorageService(){
    }

    @Override
    public void saveTraining(Training training){
        List<Training> miLista = this.getTrainingList();
        miLista.add(training);
        this.setTrainingList(miLista);
    }

    @Override
    public int numberOfCourses(){
        return this.getTrainingList().size();
    }

    public List<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(List<Training> trainingList) {
        this.trainingList = trainingList;
    }
}
