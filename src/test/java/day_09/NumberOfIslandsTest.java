package day_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void shouldReturnOne() {
        char[][] input = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        assertEquals(1, new NumberOfIslands().numIslands(input));
    }

    @Test
    void shouldReturnThree() {
        char[][] input = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        assertEquals(3, new NumberOfIslands().numIslands(input));
    }

}