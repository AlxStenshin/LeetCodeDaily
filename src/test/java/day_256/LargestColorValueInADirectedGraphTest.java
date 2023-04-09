package day_256;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestColorValueInADirectedGraphTest {

    @Test
    void shouldReturnThree() {
        String colors = "abaca";
        int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {3, 4}};
        int expected = 3;

        assertEquals(expected, new LargestColorValueInADirectedGraph().largestPathValue(colors, edges));
    }

    @Test
    void shouldReturnMinusOne() {
        String colors = "a";
        int[][] edges = {{0, 0}};
        int expected = -1;

        assertEquals(expected, new LargestColorValueInADirectedGraph().largestPathValue(colors, edges));
    }

}