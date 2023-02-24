package day_212;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeDeviationInArrayTest {

    @Test
    void shouldReturnOne() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(1, new MinimizeDeviationInArray().minimumDeviation(nums));
    }

    @Test
    void shouldReturnThree() {
        int[] nums = {4, 1, 5, 20, 3};
        assertEquals(3, new MinimizeDeviationInArray().minimumDeviation(nums));
    }

    @Test
    void shouldAlsoReturnThree() {
        int[] nums = {2, 10, 8};
        assertEquals(3, new MinimizeDeviationInArray().minimumDeviation(nums));
    }

}