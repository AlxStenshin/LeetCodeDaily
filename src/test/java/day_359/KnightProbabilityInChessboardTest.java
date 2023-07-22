package day_359;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightProbabilityInChessboardTest {
    @Test
    void shouldReturnZeroSixTwoFive() {
        int n = 3, k = 2, row = 0, column = 0;
        assertEquals(0.06250f, new KnightProbabilityInChessboard().knightProbability(n, k, row, column));
    }

    @Test
    void shouldReturnOne() {
        int  n = 1, k = 0, row = 0, column = 0;
        assertEquals(1.0f, new KnightProbabilityInChessboard().knightProbability(n, k, row, column));
    }
}