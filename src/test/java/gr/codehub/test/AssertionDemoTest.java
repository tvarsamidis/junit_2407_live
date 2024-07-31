package gr.codehub.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class AssertionDemoTest {

    @Test
    void exampleTest01() {
        int i = 8;
        System.out.println("i=" + i);
        fail("Will be released in September");
    }

    @Test
    void exampleTest02() {
        int expected = 1;
        int actual = (int) (Math.random() * 2);
        assertEquals(expected, actual);
    }

    @Test
    void exampleTest03() {
        int expected = 1;
        int actual = 2;
        assertEquals(expected, actual, "Credit card CVV is wrong!");
    }
    
    private static boolean[] gameResults(){
        return new boolean[]{true, false, true};
    }
    
    @Test
    void exampleTest04() {
        boolean[] expected = {true, false, false};
        assertArrayEquals(expected, gameResults());
    }
    
    
    
    
    

}