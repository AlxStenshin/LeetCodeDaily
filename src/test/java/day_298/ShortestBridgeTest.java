package day_298;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestBridgeTest {

    @Test
    void shouldReturnOne() {
        int[][] grid = {{0, 1}, {1, 0}};
        int expected = 1;

        assertEquals(expected, new ShortestBridge().shortestBridge(grid));
    }

    @Test
    void shouldReturnOneWithComplexInput() {
        int[][] grid = {{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
        int expected = 1;

        assertEquals(expected, new ShortestBridge().shortestBridge(grid));
    }

    @Test
    void shouldReturnTwo() {
        int[][] grid = {{0, 1, 0}, {0, 0, 0}, {0, 0, 1}};
        int expected = 2;

        assertEquals(expected, new ShortestBridge().shortestBridge(grid));
    }

}