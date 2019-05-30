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

    @Test
    public void inscribedTotal_withNullList_returnsZero(){

        //Setup
        List<Person> personList = null;
        Training training = new Training("Java", personList);

        //Test
        int x = training.inscribedTotal();

        //Verify
        assertEquals("Unexpected enrollment ammount", 0, x);
    }

    @Test
    public void inscribedTotal_withEmptyList_returnsZero(){

        //Setup
        List<Person> personList = new LinkedList<>();
        Training training = new Training("Java", personList);

        //Test
        int x = training.inscribedTotal();

        //Verify
        assertEquals("Unexpected enrollment ammount", 0, x);
    }

    @Test
    public void inscribedTotal_with2inscribed_returns2(){
        //Setup
        Training training = new Training();
        List<Person> personList = new LinkedList<>();
        personList.add(new Person ("Luis", "Jimenez"));
        personList.add(new Person("Ernesto", "Guevara"));
        training.setInscribed(personList);

        //Test
        int x = training.inscribedTotal();

        //Verify
        assertEquals("Unexpected enrollment ammount", 2, x);
    }
}