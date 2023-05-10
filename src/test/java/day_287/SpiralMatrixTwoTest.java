package day_287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTwoTest {

    @Test
    void shouldReturnSquareMatrix() {
        int n = 3;
        int[][] expected = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        assertArrayEquals(expected, new SpiralMatrixTwo().generateMatrix(n));
    }

    @Test
    void shouldReturnSingleElementMatrix() {
        int n = 1;
        int[][] expected = {{1}};
        assertArrayEquals(expected, new SpiralMatrixTwo().generateMatrix(n));
    }

}