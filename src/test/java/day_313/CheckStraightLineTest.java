package day_313;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStraightLineTest {

    @Test
    void shouldReturnTrue() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    void shouldReturnTrueWithNegativeInput() {
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};
        assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    void shouldReturnFalse() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        assertFalse(new CheckStraightLine().checkStraightLine(coordinates));
    }



}