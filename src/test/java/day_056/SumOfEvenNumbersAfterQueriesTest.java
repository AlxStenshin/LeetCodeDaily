package day_056;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEvenNumbersAfterQueriesTest {

    @Test
    void shouldReturnCorrectValues() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expected = new int[]{8, 6, 2, 4};

        assertArrayEquals(expected, new SumOfEvenNumbersAfterQueries().sumEvenAfterQueries(nums, queries));
    }

    @Test
    void shouldReturnCorrectValuesOptimized() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expected = new int[]{8, 6, 2, 4};

        assertArrayEquals(expected, new SumOfEvenNumbersAfterQueries().sumEvenAfterQueriesOptimized(nums, queries));
    }


    @Test
    void shouldReturnZero() {
        int[] nums = new int[]{1};
        int[][] queries = new int[][]{{4, 0}};
        int[] expected = new int[]{0};

        assertArrayEquals(expected, new SumOfEvenNumbersAfterQueries().sumEvenAfterQueriesOptimized(nums, queries));
    }

    @Test
    void shouldReturnZeroOptimized() {
        int[] nums = new int[]{1};
        int[][] queries = new int[][]{{4, 0}};
        int[] expected = new int[]{0};

        assertArrayEquals(expected, new SumOfEvenNumbersAfterQueries().sumEvenAfterQueriesOptimized(nums, queries));
    }

}