package com.examen1.luisjimenez.examen1;

import com.examen1.luisjimenez.examen1.service.InMemoryTrainingStorageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InMemoryTrainingStorageServiceTest {

    @Autowired
    private Person person;

    @Autowired
    private Training training;


    //GuardarCursos
    //MostrarCursosGuardados

    @Test
    public void saveCourse_guardarCurso_Succes(){
        //Setup
        person.setName("Luis");
        person.setLastName("Jimenez");

        training.setCourseName("Java");
        training.setPerson(person);

        InMemoryTrainingStorageService myService = new InMemoryTrainingStorageService();
        myService.saveCourse(training);

        //Test
        boolean checker;
        if(myService.getCourseList()==null){
            checker = false;
        }
        else{
            checker = true;
        }

        //Verify
        assertEquals("El objeto training no se ha almacenado correctamente", true, checker);



    }

    @Test
    public void numberOfCourses_mostrarCursosAlmacenados_listaConCursosAlmacenadosOCero(){

        //Setup
        person.setName("Luis");
        person.setLastName("Jimenez");

        training.setCourseName("Angular");
        training.setCourseName("Java");
        training.setPerson(person);


        InMemoryTrainingStorageService myService = new InMemoryTrainingStorageService();
        myService.saveCourse(training);

        //Test


        //Verify



    }
}