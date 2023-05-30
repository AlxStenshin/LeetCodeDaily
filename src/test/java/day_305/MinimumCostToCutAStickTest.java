package day_305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToCutAStickTest {
    @Test
    void shouldReturnSixteen() {
        int n = 7;
        int[] cuts = {1, 3, 4, 5};
        int expected = 16;

        assertEquals(expected, new MinimumCostToCutAStick().minCost(n, cuts));
    }

    @Test
    void shouldReturnTwentyTwo() {
        int n = 9;
        int[] cuts = {5, 6, 1, 4, 2};
        int expected = 22;

        assertEquals(expected, new MinimumCostToCutAStick().minCost(n, cuts));
    }
}