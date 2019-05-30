package com.springhibernate.demo.persistence.service;

import com.springhibernate.demo.persistence.entity.Student;
import com.springhibernate.demo.persistence.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void createStudent(Student student) {
        studentDao.save(student);
    }

    @Transactional
    public List<Student> listStudents() {
        return studentDao.getAll();
    }

    @Transactional
    public Optional<Student> listStudent(long id) {
        return studentDao.get(id);
    }

    @Transactional
    public void remove(Student student) {
        studentDao.delete(student);
    }
}
