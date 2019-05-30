import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonGreeterTest {

    @Test
    public void sayHello_personWithFirstNameAndLastName_shouldReturnPersonGreet(){
        //Setup
        Person person = new Person("Luis", "Jimenez");
        PersonGreeter personGreeter = new PersonGreeter(person);

        //Test
        String salute = personGreeter.sayHello();

        //Verify
        assertNotNull("Greeint should not be null", salute);
        assertEquals("Greeting with an expected value", "Hello Luis Jimenez", salute);

    }
}