package com.springhibernate.demo.web.controller;

import com.springhibernate.demo.persistence.entity.Student;
import com.springhibernate.demo.persistence.service.StudentService;
import com.springhibernate.demo.web.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentListController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String listStudents(ModelMap model) {
        List<Student> studentList;
        studentList = studentService.listStudents();
        model.put("studentList", studentList);
        return "students";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String listStudent(ModelMap model, @RequestParam long id) {
        Optional<Student> student;
        student = studentService.listStudent(id);
        studentService.remove(student.get());
        if (student.isPresent()) {
            model.put("studentList", Arrays.asList(student.get()));
        }
        return "students";
    }
}
