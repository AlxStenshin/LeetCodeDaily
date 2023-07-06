package day_344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    @Test
    void shouldReturnZero() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(0, new MinimumSizeSubarraySum().minSubArrayLen(target, nums));
    }

    @Test
    void shouldReturnOne() {
        int target = 4;
        int[] nums = {1, 4, 4};
        assertEquals(1, new MinimumSizeSubarraySum().minSubArrayLen(target, nums));
    }

    @Test
    void shouldReturnTwo() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, new MinimumSizeSubarraySum().minSubArrayLen(target, nums));
    }

}