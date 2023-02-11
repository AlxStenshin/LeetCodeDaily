package day_199;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathWithAlternatingColorsTest {

    @Test
    void shouldReturn_ZeroOneMinusOne() {
        int n = 3;
        int[][] redEdges = {{0,1}, {1,2}};
        int[][] blueEdges = {};

        assertArrayEquals(new int[]{0, 1, -1},
                new ShortestPathWithAlternatingColors().shortestAlternatingPaths(n, redEdges, blueEdges));
    }

    @Test
    void shouldAlsoReturn_ZeroOneMinusOne() {
        int n = 3;
        int[][] redEdges = {{0, 1}};
        int[][] blueEdges = {{2, 1}};

        assertArrayEquals(new int[]{0, 1, -1},
                new ShortestPathWithAlternatingColors().shortestAlternatingPaths(n, redEdges, blueEdges));
    }
}