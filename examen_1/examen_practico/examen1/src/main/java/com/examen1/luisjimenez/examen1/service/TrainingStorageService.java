package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Training;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrainingStorageService {

    void saveCourse(Training training);
    List<Training> numberOfCourses();

}
