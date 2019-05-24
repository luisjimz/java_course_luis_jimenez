package com.examen1.luisjimenez.examen1.service;

import com.examen1.luisjimenez.examen1.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InMemoryTrainingStorageService implements TrainingStorageService {

    @Autowired
    private Training training;

    private List<Training> courseList;

    public InMemoryTrainingStorageService(){
    }

    @Override
    public void saveCourse(Training training) {
        this.courseList.add(training);
    }

    @Override
    public List<Training> numberOfCourses(){
        return this.courseList;
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
