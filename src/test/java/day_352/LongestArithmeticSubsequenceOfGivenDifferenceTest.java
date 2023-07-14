package day_352;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceOfGivenDifferenceTest {

    @Test
    void shouldReturnOne() {
        int[] arr = {1, 3, 5, 7};
        int difference = 1;

        assertEquals(1, new LongestArithmeticSubsequenceOfGivenDifference().longestSubsequence(arr, difference));
    }

    @Test
    void shouldReturnFour() {
        int[] arr = {1, 2, 3, 4};
        int difference = 1;

        assertEquals(4, new LongestArithmeticSubsequenceOfGivenDifference().longestSubsequence(arr, difference));
    }

    @Test
    void shouldReturnFourWithNegativeDifference() {
        int[] arr = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        int difference = -2;

        assertEquals(4, new LongestArithmeticSubsequenceOfGivenDifference().longestSubsequence(arr, difference));
    }
}