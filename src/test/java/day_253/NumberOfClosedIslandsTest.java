package day_253;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfClosedIslandsTest {

    @Test
    void shouldReturnTwo() {
        int[][] grid = {
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}};
        assertEquals(2, new NumberOfClosedIslands().closedIsland(grid));
    }

    @Test
    void shouldAlsoReturnTwo() {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}};
        assertEquals(2, new NumberOfClosedIslands().closedIsland(grid));
    }

    @Test
    void shouldReturnOne() {
        int[][] grid = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0}};
        assertEquals(1, new NumberOfClosedIslands().closedIsland(grid));
    }

}