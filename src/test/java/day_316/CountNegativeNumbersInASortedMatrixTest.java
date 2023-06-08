package day_316;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNegativeNumbersInASortedMatrixTest {

    @Test
    void shouldReturnEight() {
        int[][] matrix = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        assertEquals(8, new CountNegativeNumbersInASortedMatrix().countNegatives(matrix));
    }

    @Test
    void shouldReturnZero() {
        int[][] matrix = {{3, 2}, {1, 0}};
        assertEquals(0, new CountNegativeNumbersInASortedMatrix().countNegatives(matrix));
    }
}