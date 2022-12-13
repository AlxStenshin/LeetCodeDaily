package day_139;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumTest {

    @Test
    void shouldReturnThirteen() {
        int[][] input = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        assertEquals(13, new MinimumFallingPathSum().minFallingPathSum(input));
    }

    @Test
    void shouldReturnMinusFiftyNine() {
        int[][] input = new int[][]{{-19, 57}, {-40, -5}};
        assertEquals(-59, new MinimumFallingPathSum().minFallingPathSum(input));
    }

}