package com.springhibernate.demo.web.controller;

import com.springhibernate.demo.model.AcademicStatus;
import com.springhibernate.demo.persistence.entity.Student;
import com.springhibernate.demo.persistence.service.StudentService;
import com.springhibernate.demo.persistence.util.UUIDGenerator;
import com.springhibernate.demo.web.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentRegistrationController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @RequestMapping(value = "/studentRegistration", method = RequestMethod.GET)
    public String showStudentRegistrationPage(ModelMap model) {

        return "registrationForm";
    }

    @RequestMapping(value = "/studentRegistration", method = RequestMethod.POST)
    public String showIndexPage(ModelMap model,
                                @RequestParam String studentname,
                                @RequestParam String studentlastname,
                                @RequestParam int age,
                                @RequestParam Long addressId,
                                @RequestParam String email,
                                @RequestParam String academicstatus) {
        Student student = new Student(studentname, studentlastname, email, age, UUIDGenerator.generateDefault(), AcademicStatus.valueOf(academicstatus));
        studentRegistrationService.createStudent(student, addressId);
        return "index";
    }

}
