package day_254;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfEnclavesTest {

    @Test
    void shouldReturnThree() {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        assertEquals(3, new NumberOfEnclaves().numEnclaves(grid));
    }

    @Test
    void shouldReturnZero() {
        int[][] grid = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};

        assertEquals(0, new NumberOfEnclaves().numEnclaves(grid));
    }

}