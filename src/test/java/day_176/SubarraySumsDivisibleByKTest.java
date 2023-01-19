package day_176;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumsDivisibleByKTest {

    @Test
    void shouldReturnSeven() {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        assertEquals(7, new SubarraySumsDivisibleByK().subarraysDivByK(nums, k));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = {5};
        int k = 9;

        assertEquals(0, new SubarraySumsDivisibleByK().subarraysDivByK(nums, k));
    }

}