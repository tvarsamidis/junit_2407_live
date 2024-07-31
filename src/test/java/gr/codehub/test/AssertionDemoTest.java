package gr.codehub.test;

import java.io.File;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    private static boolean[] gameResults() {
        return new boolean[]{true, false, true};
    }

    @Test
    void exampleTest04() {
        boolean[] expected = {true, false, false};
        assertArrayEquals(expected, gameResults());
    }

    @Test
    void exampleTest05() {
        String text = "Hello";
        assertTrue(text.charAt(0) == 'H', "First character must be H for " + text);
        assertFalse(text.charAt(1) == 'e', "Second character must not be 'e' for " + text);
    }

    @Test
    void exampleTest06() {
        assertAll("Hulk properties", () -> assertEquals("green", "green"), () -> assertEquals("Bow", "Bow"));
    }

    @Test
    void exampleTest07() {
        assertEquals(Main.divide(10, 5), 2, "Division of 10/5 must result in 2");
        assertThrows(ArithmeticException.class, () -> {
            System.out.println("Trying to run divide");
            int result = Main.divide(10, 0);
            System.out.println("All done, result is " + result);
        }
        );
    }

    @Test
    void exampleTes08() {
        File f = new File("C:\\");
        assertNull(f.getParentFile(), "Root folder must have no parent");
    }

}
