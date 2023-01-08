package day_165;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPointsOnLineTest {

    @Test
    void shouldReturnThree() {
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        assertEquals(3, new MaxPointsOnLine().maxPoints(points));
    }

    @Test
    void shouldReturnFour() {
        int[][] points = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        assertEquals(4, new MaxPointsOnLine().maxPoints(points));
    }

}