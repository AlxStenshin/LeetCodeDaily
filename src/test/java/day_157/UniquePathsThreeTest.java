package day_157;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsThreeTest {

    @Test
    void shouldReturnTwo() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        assertEquals(2, new UniquePathsThree().uniquePathsIII(grid));
    }

    @Test
    void shouldReturnFour() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        assertEquals(4, new UniquePathsThree().uniquePathsIII(grid));
    }

    @Test
    void shouldReturnZero() {
        int[][] grid = new int[][]{{0, 1}, {2, 0}};
        assertEquals(0, new UniquePathsThree().uniquePathsIII(grid));
    }

}