import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void testCase1(){
        fail("not implemented ");

    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Before each is executed");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("After each is executed");
    }

    @Test
    void testCase2(){
        assertTrue(Calculator.operator.equals("att"),"balta");
    }
    @Test
    void testCase3(){
        assertEquals("add",Calculator.operator);
    }

    @Test
    void testCase4(){
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }


    @BeforeAll
    static void setUpAll(){
        System.out.println("Before all executed");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("After all executed");
    }


    @Test
    void testCase5(){
        String nullStr = null;
        String nullNotStr = "Maho aga null degildir";

        assertNull(nullStr);
        assertNull(nullNotStr);


    }

    @Test
    void testCase6(){
        Calculator c1 = new Calculator();
        Calculator c2= c1;
        assertSame(c1,c2);

    }

    @Test
    void divide(){
        assertThrows(ArithmeticException.class,()->Calculator.divide(1,0));

    }

    @Test
    void testCase8(){

    }

    @Test
    void testCase9(){

    }



    @Test
    void add(){
      int actual = Calculator.add(2,3);
      assertEquals(5,actual, "balta 3 le besi toplayamiyir daha");

    }

}