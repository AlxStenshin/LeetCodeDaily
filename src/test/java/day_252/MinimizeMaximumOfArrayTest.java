package day_252;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeMaximumOfArrayTest {

    @Test
    void shouldReturnFive() {
        int[] nums = {3, 7, 1, 6};
        assertEquals(5, new MinimizeMaximumOfArray().minimizeArrayValue(nums));
    }

    @Test
    void shouldReturnTen() {
        int[] nums = {10, 1};
        assertEquals(10, new MinimizeMaximumOfArray().minimizeArrayValue(nums));
    }

}