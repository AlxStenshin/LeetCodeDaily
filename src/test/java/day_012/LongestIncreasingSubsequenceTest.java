package day_012;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    @Test
    void shouldReturnFour() {
        // The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{7, 7, 7, 7, 7}));
    }

}