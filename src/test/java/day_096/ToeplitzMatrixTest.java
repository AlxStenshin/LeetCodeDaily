package day_096;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToeplitzMatrixTest {

    @Test
    void shouldReturnTrue() {
        int[][] input = new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(input));
    }

    @Test
    void shouldReturnFalse() {
        int[][] input = new int[][]{{1, 2}, {2, 2}};
        assertFalse(new ToeplitzMatrix().isToeplitzMatrix(input));
    }

}