import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class StringParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"aaa","bbb","ccc","love"})
    void testCase1(String args){
        assertTrue(StringManipulation.islovely(Arrays.asList(args)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaa","bbb","ccc","ddd"})
    void testCase2(String args){
        assertEquals(3,args.length());

    }

    @ParameterizedTest
    @ValueSource(strings = {"aaa","bbb","ccc","ddd"})
    @EmptySource
    void testCase3(String args){
        assertEquals(3,args.length());

    }

    @ParameterizedTest
    //@NullSource
    @NullAndEmptySource
    void testCase4(String args){
        assertNull(args);

    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase5(String arg){
        assertNotNull(arg);
    }

    @ParameterizedTest
    @CsvSource({"10,20,1020", "30,40,70", "as,la,asla"})
    void testCase6(String a,String b,String result){
        assertEquals(result,StringManipulation.concat(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/simpleStringData.csv",numLinesToSkip = 1)
    void testCase7(String a,String b,String result){
        assertEquals(result,StringManipulation.concat(a,b));
    }
    static String[] stringProvider(){
        return new String[] {"aaa","bbb","ccc","ddd"};
    }
}
