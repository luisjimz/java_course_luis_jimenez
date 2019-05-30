package com.examen1.luisjimenez.examen1;

import com.examen1.luisjimenez.examen1.service.InMemoryTrainingStorageService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InMemoryTrainingStorageServiceTest {
    private InMemoryTrainingStorageService inMemoryTrainingStorageService;

    @Before
    public void setUp() throws Exception{
        inMemoryTrainingStorageService = new InMemoryTrainingStorageService();
    }

    @Test
    public void saveTraining_guardarCurso_Succes(){
        //Setup
        InMemoryTrainingStorageService inMemoryTrainingStorageService = new InMemoryTrainingStorageService();
        List<Person> misAlumnos = new LinkedList<>();
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

        misAlumnos.add(a);
        misAlumnos.add(b);
        misAlumnos.add(c);

        java.setInscribed(misAlumnos);
        java.setCourseName("Java");
        angular.setInscribed(misAlumnos);
        angular.setCourseName("Angular");

        //Test
        inMemoryTrainingStorageService.saveTraining(java);
        inMemoryTrainingStorageService.saveTraining(angular);

        //Verify
        assertNotNull("La lista interna de mi servicio no ha sido instanciada", inMemoryTrainingStorageService.getTrainingList());
        assertNotEquals("El servicio no contiene cursos registrados", 0, inMemoryTrainingStorageService.getTrainingList().size());
    }

    @Test
    public void numberOfCourses_mostrarCursosAlmacenados_listaConCursosAlmacenadosOCero(){
        //Setup
        InMemoryTrainingStorageService inMemoryTrainingStorageService = new InMemoryTrainingStorageService();
        List<Person> misAlumnos = new LinkedList<>();
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

        misAlumnos.add(a);
        misAlumnos.add(b);
        misAlumnos.add(c);

        java.setInscribed(misAlumnos);
        java.setCourseName("Java");
        angular.setInscribed(misAlumnos);
        angular.setCourseName("Angular");


        //Test
        inMemoryTrainingStorageService.saveTraining(java);
        inMemoryTrainingStorageService.saveTraining(angular);
        inMemoryTrainingStorageService.numberOfCourses();

        //Verify
        assertNotNull("La lista interna de mi servicio no ha sido instanciada", inMemoryTrainingStorageService.getTrainingList());
        assertEquals("La lista no contiene 2 cursos almacenados como se esperaria que fuera, almacena basura", 2, inMemoryTrainingStorageService.numberOfCourses());

    }
}