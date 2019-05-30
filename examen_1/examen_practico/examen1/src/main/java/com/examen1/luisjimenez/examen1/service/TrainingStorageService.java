package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Training;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainingStorageService {

    void saveTraining(Training training);
    int numberOfCourses();

}