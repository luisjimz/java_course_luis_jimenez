package com.examen1.luisjimenez.examen1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;


import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingTest {

    @Autowired
    private Person person;

    //metodo_condicion_resultado
    @Test
    public void inscribedTotal_devolverTotalInscritosSiEsNuloDevolverCero_unEntero(){
        //Setup
        Training training = new Training();
        List<Person> personList = new LinkedList<>();


        training.setInscribed(personList);

        //Test
        int x = training.inscribedTotal();

        //Verify
        assertEquals("Si la lista está vacía, devuelve 0", 0, x);
    }

    @Test
    public void inscribedTotal_devolverSiempreUnNumeroPositivo_unEntero(){
        //Setup
        Training training = new Training();
        List<Person> personList = new LinkedList<>();
        boolean checker;

        person.setName("Luis");
        person.setLastName("Jimenez");
        personList.add(person);
        person.setName("Juan");
        person.setLastName("Ramirez");
        personList.add(person);

        training.setInscribed(personList);

        //Test

        if(training.inscribedTotal() <= 1){
            checker = false;
        }else{
            checker = true;
        }

        //Verify
        assertEquals("El número devuelto por la lista siempre debe ser positivo", true, checker);
    }





}