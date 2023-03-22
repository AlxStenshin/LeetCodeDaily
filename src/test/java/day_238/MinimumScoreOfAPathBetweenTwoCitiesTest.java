package day_238;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumScoreOfAPathBetweenTwoCitiesTest {

    @Test
    void shouldReturnFive() {
        int n = 4;
        int[][] roads = {{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}};
        int expected = 5;

        assertEquals(expected, new MinimumScoreOfAPathBetweenTwoCities().minScore(n, roads));
    }

    @Test
    void shouldReturnTwo() {
        int n = 4;
        int[][] roads = {{1, 2, 2}, {1, 3, 4}, {3, 4, 7}};
        int expected = 2;

        assertEquals(expected, new MinimumScoreOfAPathBetweenTwoCities().minScore(n, roads));
    }

}