package day_095;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInAGridWithObstaclesEliminationTest {

    @Test
    void shouldReturnSix() {
        int[][] grid = new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};
        int k = 1;
        assertEquals(6, new ShortestPathInAGridWithObstaclesElimination().shortestPath(grid, k));
    }

    @Test
    void shouldReturnMinusOne() {
        int[][] grid = new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 0, 0}};
        int k = 1;
        assertEquals(-1, new ShortestPathInAGridWithObstaclesElimination().shortestPath(grid, k));
    }
}