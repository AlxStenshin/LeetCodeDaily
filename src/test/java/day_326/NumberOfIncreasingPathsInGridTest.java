package day_326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIncreasingPathsInGridTest {

    @Test
    void shouldReturnThree() {
        int[][] grid = {{1}, {2}};
        assertEquals(3, new NumberOfIncreasingPathsInGrid().countPaths(grid));
    }

    @Test
    void shouldReturnEight() {
        int[][] grid = {{1, 1}, {3, 4}};
        assertEquals(8, new NumberOfIncreasingPathsInGrid().countPaths(grid));
    }

}