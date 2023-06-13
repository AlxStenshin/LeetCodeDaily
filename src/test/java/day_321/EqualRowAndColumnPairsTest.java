package day_321;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualRowAndColumnPairsTest {

    @Test
    void shouldReturnOne() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        assertEquals(1, new EqualRowAndColumnPairs().equalPairs(grid));
    }

    @Test
    void shouldReturnThree() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        assertEquals(3, new EqualRowAndColumnPairs().equalPairs(grid));
    }
}