package day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnZeroOne() {
        int[] nums = {2,7,11,15};
        int target = 9;

        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(nums, target));
    }

    @Test
    void shouldReturnOneTwo() {
        int[] nums = {3,4,2};
        int target = 6;

        assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(nums, target));
    }

    @Test
    void shouldAlsoReturnZeroOne() {
        int[] nums = {3, 3};
        int target = 6;

        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(nums, target));
    }

}