package day_097;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhereWillTheBallFallTest {

    @Test
    void shouldPassOnlyFirstBall() {
        int[][] input = new int[][]{
                {1, 1, 1, -1, -1},
                {1, 1, 1, -1, -1},
                {-1, -1, -1, 1, 1},
                {1, 1, 1, 1, -1},
                {-1, -1, -1, -1, -1}};
        int[] expected = new int[]{1, -1, -1, -1, -1};
        assertArrayEquals(expected, new WhereWillTheBallFall().findBall(input));
    }

    @Test
    void shouldNotPassOnlyLastBall() {
        int[][] input = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}};
        int[] expected = new int[]{0, 1, 2, 3, 4, -1};
        assertArrayEquals(expected, new WhereWillTheBallFall().findBall(input));
    }

    @Test
    void shouldBlockTheBall() {
        int[][] input = new int[][]{{-1}};
        int[] expected = new int[]{-1};
        assertArrayEquals(expected, new WhereWillTheBallFall().findBall(input));
    }

}