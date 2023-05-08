package day_285;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {

    @Test
    void shouldReturnTwentyFive() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        assertEquals(25, new MatrixDiagonalSum().diagonalSum(mat));
    }

    @Test
    void shouldReturnEight() {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        assertEquals(8, new MatrixDiagonalSum().diagonalSum(mat));
    }

    @Test
    void shouldReturnFive() {
        int[][] mat = {{5}};

        assertEquals(5, new MatrixDiagonalSum().diagonalSum(mat));
    }

}