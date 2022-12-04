package day_130;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAverageDifferenceTest {

    @Test
    void shouldReturnThree() {
        int[] input = new int[]{2, 5, 3, 9, 5, 3};
        assertEquals(3, new MinimumAverageDifference().minimumAverageDifference(input));
    }

    @Test
    void shouldReturnZero() {
        int[] input = new int[]{0};
        assertEquals(0, new MinimumAverageDifference().minimumAverageDifference(input));
    }
}