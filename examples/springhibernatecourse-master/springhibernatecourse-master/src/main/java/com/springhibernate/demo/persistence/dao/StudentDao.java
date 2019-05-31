package com.springhibernate.demo.persistence.dao;

import com.springhibernate.demo.persistence.entity.Address;
import com.springhibernate.demo.persistence.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class StudentDao implements IStudentDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional<Student> get(long id) {
        Student student = em.createQuery("select st from Student st where id = " + id, Student.class).getSingleResult();
        System.out.println("---------------Print student from JPQL query: " + student.getEmail() + " ---------------");
        Student hibernateStudent = em.find(Student.class, id);
        System.out.println("---------------Print student from hibernate find implementation: " + hibernateStudent.getEmail() + " ---------------");
        //return Optional.ofNullable(student1);
        return Optional.ofNullable(student);
    }

    @Override
    //Porque Autowired?
    @Autowired
    public List<Student> getAll() {
        System.out.println("---------------Printing studentList from JPQL query---------------");
        List<Student> studentList = em.createQuery("from Student order by email DESC", Student.class).getResultList();
        for (Student s : studentList) {
            System.out.println(s.getEmail());
        }
        printAllStudentsWithCriteriaQuery();
        return studentList;
    }

    public void printAllStudentsWithCriteriaQuery() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> rootEntry = cq.from(Student.class);
        System.out.println("---------------Printing all students from Criteria query---------------");
        CriteriaQuery<Student> all = cq.select(rootEntry);
        TypedQuery<Student> allQuery = em.createQuery(all);
        for (Student s : allQuery.getResultList()) {
            System.out.println(s.getEmail());
        }
    }

    @Override
    @Transactional
    public int save(Object o) {
        em.persist(o);
        log.error("persisted object" + o);
        return 1;
    }

    @Override
    public void delete(Object o) {
        em.remove(o);
    }
}
