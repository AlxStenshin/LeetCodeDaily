package day_243;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    @Test
    void shouldReturnSeven() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, new MinimumPathSum().minPathSum(grid));
    }

    @Test
    void shouldReturnTwelve() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(12, new MinimumPathSum().minPathSum(grid));
    }

}