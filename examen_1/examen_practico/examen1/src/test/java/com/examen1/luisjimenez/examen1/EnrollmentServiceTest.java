package com.examen1.luisjimenez.examen1;

import com.examen1.luisjimenez.examen1.service.EnrollmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnrollmentServiceTest {

    @Autowired
    private EnrollmentService enrollmentService;

//    @Autowired
//    private  Person person;
//
//    @Autowired
//    private Training training;

    //metodo_condicion_resultado
    @Test
    public void enroll_EjecucionDebeDetenerseSiTrainingOPersonaSonNulos_FinDeEjecucion(){
        //Setup
        EnrollmentService enrollmentService = new EnrollmentService();
        List<Person> listaAlumnos = new LinkedList<>();
        Training java = new Training();
        Training angular = new Training();
        Person a = new Person();
        Person b = new Person();
        Person c = new Person();
        a.setName("Luis");
        a.setLastName("Jimenez");
        b.setName("Juan");
        b.setLastName("De La Fuente");
        c.setName("Ramiro");
        c.setLastName("Ruvalcaba");

        java.setCourseName("Java");
        angular.setCourseName("Angular");
        listaAlumnos.add(a);
        //listaAlumnos.add(c);
        java.setInscribed(listaAlumnos);

        //Test
        enrollmentService.enroll(b, java);

        //Verify
        assertNotNull("Objetos Person no debe de ser nulo", java);
        assertNotNull("Objeto Training no debe de ser nulo", a);
        assertEquals("Se espera que solo cuente con 1 alumno almacenado el curso especifico", 2 ,java.inscribedTotal());



    }


}