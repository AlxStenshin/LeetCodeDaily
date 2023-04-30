package day_277;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemMaxNumberOfEdgesToKeepGraphFullyTraversableTest {
    @Test
    void shouldReturnTwo() {
        int n = 4;
        int[][] edges = {{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}};
        int expected = 2;

        assertEquals(expected, new RemMaxNumberOfEdgesToKeepGraphFullyTraversable().maxNumEdgesToRemove(n, edges));
    }

    @Test
    void shouldReturnZero() {
        int n = 4;
        int[][] edges = {{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}};
        int expected = 0;

        assertEquals(expected, new RemMaxNumberOfEdgesToKeepGraphFullyTraversable().maxNumEdgesToRemove(n, edges));
    }

    @Test
    void shouldReturnMinusOne() {
        int n = 4;
        int[][] edges = {{3, 2, 3}, {1, 1, 2}, {2, 3, 4}};
        int expected = -1;

        assertEquals(expected, new RemMaxNumberOfEdgesToKeepGraphFullyTraversable().maxNumEdgesToRemove(n, edges));
    }

}