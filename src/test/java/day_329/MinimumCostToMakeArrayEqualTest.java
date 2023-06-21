package day_329;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToMakeArrayEqualTest {

    @Test
    void shouldReturnEight() {
        int[] nums = {1,3,5,2};
        int[] cost = {2,3,1,14};
        int expected = 8;

        assertEquals(expected, new MinimumCostToMakeArrayEqual().minCost(nums, cost));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = {2,2,2,2,2};
        int[] cost = {4,2,8,1,3};
        int expected = 0;

        assertEquals(expected, new MinimumCostToMakeArrayEqual().minCost(nums, cost));
    }

}