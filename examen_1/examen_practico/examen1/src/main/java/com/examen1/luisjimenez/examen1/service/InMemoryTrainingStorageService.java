package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class InMemoryTrainingStorageService implements TrainingStorageService {

    @Autowired
    private Training training;

    @Autowired
    private List<Training> courseList;

    public InMemoryTrainingStorageService(){
        this.courseList = new LinkedList<>();
    }

    @Override
    public void saveCourse(Training training){
        List<Training> miLista = this.getCourseList();
        miLista.add(training);
        this.setCourseList(miLista);
    }

    @Override
    public int numberOfCourses(){
        return this.getCourseList().size();
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public List<Training> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Training> courseList) {
        this.courseList = courseList;
    }
}
