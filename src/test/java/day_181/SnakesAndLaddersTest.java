package day_181;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesAndLaddersTest {

    @Test
    void shouldReturnFour() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}};

        assertEquals(4, new SnakesAndLadders().snakesAndLadders(board));
    }

    @Test
    void shouldReturnOne() {
        int[][] board = {{-1, -1}, {-1, 3}};

        assertEquals(1, new SnakesAndLadders().snakesAndLadders(board));
    }

}