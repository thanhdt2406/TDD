import com.codegym.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testShowFizzBuzz1() {
        int number = 1;
        String expected = "1";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz2() {
        int number = 2;
        String expected = "2";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz3() {
        int number = 3;
        String expected = "Fizz";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz4() {
        int number = 4;
        String expected = "4";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz5() {
        int number = 5;
        String expected = "Buzz";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz6() {
        int number = 6;
        String expected = "Fizz";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz14() {
        int number = 14;
        String expected = "14";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }

    @Test
    void testShowFizzBuzz16() {
        int number = 16;
        String expected = "16";

        boolean result = expected.equals(FizzBuzz.showFizzBuzz(number));

        assertTrue(result);
    }
}