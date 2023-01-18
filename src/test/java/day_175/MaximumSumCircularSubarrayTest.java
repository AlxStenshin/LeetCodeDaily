package day_175;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumCircularSubarrayTest {

    @Test
    void shouldReturnThree() {
        int[] nums = {1, -2, 3, -2};
        assertEquals(3, new MaximumSumCircularSubarray().maxSubarraySumCircular(nums));
    }

    @Test
    void shouldReturnTen() {
        int[] nums = {5, -3, 5};
        assertEquals(10, new MaximumSumCircularSubarray().maxSubarraySumCircular(nums));
    }

    @Test
    void shouldReturnMinusTwo() {
        int[] nums = {-3, -2, -3};
        assertEquals(-2, new MaximumSumCircularSubarray().maxSubarraySumCircular(nums));
    }

}