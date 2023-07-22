package day_358;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLongestIncreasingSubsequenceTest {

    @Test
    void shouldReturnTwo() {
        int[] nums = {1, 3, 5, 4, 7};
        assertEquals(2, new NumberOfLongestIncreasingSubsequence().findNumberOfLIS(nums));
    }

    @Test
    void shouldReturnFive() {
        int[] nums = {2, 2, 2, 2, 2};
        assertEquals(5, new NumberOfLongestIncreasingSubsequence().findNumberOfLIS(nums));
    }
}