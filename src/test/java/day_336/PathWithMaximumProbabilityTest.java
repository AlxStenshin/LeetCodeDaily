package day_336;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathWithMaximumProbabilityTest {

    @Test
    void shouldReturnZeroPointTwentyFive() {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = {0.5, 0.5, 0.2};
        int start = 0;
        int end = 2;

        assertEquals(0.25000d, new PathWithMaximumProbability().maxProbability(n, edges, succProb, start, end));
    }

    @Test
    void shouldReturnZeroPointThirty() {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = {0.5, 0.5, 0.3};
        int start = 0;
        int end = 2;

        assertEquals(0.30000d, new PathWithMaximumProbability().maxProbability(n, edges, succProb, start, end));

    }

    @Test
    void shouldReturnZero() {
        int n = 3;
        int[][] edges = {{0, 1}};
        double[] succProb = {0.5};
        int start = 0;
        int end = 2;

        assertEquals(0.0d, new PathWithMaximumProbability().maxProbability(n, edges, succProb, start, end));
    }
}