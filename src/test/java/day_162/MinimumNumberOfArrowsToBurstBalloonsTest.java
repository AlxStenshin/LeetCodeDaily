package day_162;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    void shouldReturnTwo() {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(points));
    }

    @Test
    void shouldReturnFour() {
        int[][] points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertEquals(4, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(points));
    }

    @Test
    void shouldAlsoReturnTwo() {
        int[][] points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(points));
    }

}