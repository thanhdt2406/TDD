import com.codegym.NextDayCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testFindNextDay1_1_2018() {
        int[] day = {1, 1, 2018};
        int[] expected = {2, 1, 2018};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFindNextDay31_1_2018() {
        int[] day = {31, 1, 2018};
        int[] expected = {1, 2, 2018};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFindNextDay30_4_2018() {
        int[] day = {30, 4, 2018};
        int[] expected = {1, 5, 2018};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFindNextDay28_2_2018() {
        int[] day = {28, 2, 2018};
        int[] expected = {1, 3, 2018};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFindNextDay29_2_2018() {
        int[] day = {29, 2, 2020};
        int[] expected = {1, 3, 2020};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFindNextDay31_12_2018() {
        int[] day = {31, 12, 2018};
        int[] expected = {1, 1, 2019};

        int[] result = NextDayCalculator.findNextDay(day);

        assertArrayEquals(expected, result);
    }

}