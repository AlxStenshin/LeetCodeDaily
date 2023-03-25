package day_241;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUnreachablePairsOfNodesInAnUndirectedGraphTest {

    @Test
    void shouldReturnZero() {
        int n = 3;
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}};
        assertEquals(0, new CountUnreachablePairsOfNodesInAnUndirectedGraph().countPairs(n, edges));
    }

    @Test
    void shouldReturnFourteen() {
        int n = 7;
        int[][] edges = {{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}};
        assertEquals(14, new CountUnreachablePairsOfNodesInAnUndirectedGraph().countPairs(n, edges));
    }

}