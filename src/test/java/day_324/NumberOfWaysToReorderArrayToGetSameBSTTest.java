package day_324;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToReorderArrayToGetSameBSTTest {
    @Test
    void shouldReturnOne() {
        int[] nums = {2, 1, 3};
        assertEquals(1, new NumberOfWaysToReorderArrayToGetSameBST().numOfWays(nums));
    }

    @Test
    void shouldReturnFive() {
        int[] nums = {3, 4, 5, 1, 2};
        assertEquals(5, new NumberOfWaysToReorderArrayToGetSameBST().numOfWays(nums));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = {1, 2, 3};
        assertEquals(0, new NumberOfWaysToReorderArrayToGetSameBST().numOfWays(nums));
    }
}