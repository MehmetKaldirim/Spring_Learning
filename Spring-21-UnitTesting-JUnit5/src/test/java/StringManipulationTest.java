import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void testCase1(){
        //fail("Not implemented yet");
    }

    @Test
    void testCase2(){
        List<String> isLoveTrue = new ArrayList<>();
        isLoveTrue.add("love");
        assertTrue(StringManipulation.islovely(isLoveTrue));
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("It is a test");
    }

    @AfterEach
    void afterEach(){
        System.out.println("test over");
    }

    @Test
    void testCase3(){
        char[] arr = {'l','o','v','e'};
        assertArrayEquals(arr,StringManipulation.charArr("love"));
    }
    @Test
    void testCase4(){
        assertNotNull("all nall");
        assertNull(null);
    }

    @BeforeAll
    static void setUpEach(){
        System.out.println("Before test make love");
    }
    @AfterAll
    static void tearDownAll(){
        System.out.println("fire up a cigarette after all ");
    }

    @Test
    void testCase5(){
        StringManipulation str1 = new StringManipulation();
        StringManipulation str2 = str1;
        StringManipulation str3 = new StringManipulation();
        assertSame(str1,str2);
        assertNotSame(str2,str3);
    }

    @Test
    void testCase6(){
        assertThrows(IndexOutOfBoundsException.class,()->StringManipulation.reverseOfString("abc"));
    }



    @Test
    void concat(){

        String actual = StringManipulation.concat("al", "fa");
        assertEquals("alfa",actual,"it s failed");
    }

}