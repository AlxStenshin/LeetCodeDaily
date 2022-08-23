package day_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void shouldReturnFifteen() {
        //Input: cost = [10,15,20]
        //Output: 15
        assertEquals(15, new MinCostClimbingStairs().minCostClimbingStairs(
                new int[]{10, 15, 20}));
    }

    @Test
    void shouldReturnSix() {
        assertEquals(6, new MinCostClimbingStairs().minCostClimbingStairs(
                new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}