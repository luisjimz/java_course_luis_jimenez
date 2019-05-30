import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {



    @BeforeClass
    public static void antesDeMiClase(){
        System.out.println("antesDeMiClase");
    }

    @AfterClass
    public static void despuesDeMiClase(){
        System.out.println("despuesDeMiClase");
    }

    @Before
    public void antesDeMiTest(){
        System.out.println("antesDeMiTest");
    }

    @After
    public void despuesDeMiTest(){
        System.out.println("despuesDeMiTest");
    }
    @Test
    public void primerPrueba(){
        System.out.println("primeraPrueba");
    }
    @Test
    public void segundaPrueba(){
        System.out.println("segundaPrueba");
    }

}