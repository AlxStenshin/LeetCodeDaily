package day_237;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfZeroFilledSubArraysTest {

    @Test
    void shouldReturnSix() {
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        assertEquals(6, new NumberOfZeroFilledSubArrays().zeroFilledSubArray(nums));
    }

    @Test
    void shouldReturnNine() {
        int[] nums = {0, 0, 0, 2, 0, 0};
        assertEquals(9, new NumberOfZeroFilledSubArrays().zeroFilledSubArray(nums));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = {2, 10, 2019};
        assertEquals(0, new NumberOfZeroFilledSubArrays().zeroFilledSubArray(nums));
    }

}