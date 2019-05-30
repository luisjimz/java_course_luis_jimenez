package com.springhibernate.demo.web.service;

import com.springhibernate.demo.persistence.entity.Address;
import com.springhibernate.demo.persistence.entity.Student;
import com.springhibernate.demo.persistence.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationService {

    @Autowired
    private StudentService studentService;

    public void createStudent(Student student, Long addressId) {
        student.setAddress(createAddressWithId(addressId));
        studentService.createStudent(student);
    }

    private Address createAddressWithId(Long addressId) {
        Address address = new Address();
        address.setId(addressId);
        return address;
    }
}
