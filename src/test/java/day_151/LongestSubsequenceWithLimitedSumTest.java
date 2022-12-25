package day_151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequenceWithLimitedSumTest {

    @Test
    void shouldReturnTwoThreeFour() {
        int[] nums = new int[]{4, 5, 2, 1};
        int[] queries = new int[]{3, 10, 21};
        int[] expected = new int[]{2, 3, 4};

        assertArrayEquals(expected, new LongestSubsequenceWithLimitedSum().answerQueries(nums, queries));
    }

    @Test
    void shouldReturnZero() {
        int[] nums = new int[]{2, 3, 4, 5};
        int[] queries = new int[]{1};
        int[] expected = new int[]{0};

        assertArrayEquals(expected, new LongestSubsequenceWithLimitedSum().answerQueries(nums, queries));
    }

}