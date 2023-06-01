package day_309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInBinaryMatrixTest {

    @Test
    void shouldReturnTwo() {
        int[][] grid = {{0, 1}, {1, 0}};
        assertEquals(2, new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid));
    }

    @Test
    void shouldReturnFour() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(4, new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid));
    }

    @Test
    void shouldReturnMinusOne() {
        int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(-1, new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid));
    }

}