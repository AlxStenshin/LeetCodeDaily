package day_182;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestNodeToGivenTwoNodesTest {

    @Test
    void shouldReturnTwo() {
        int[] edges = {2, 2, 3, -1};
        int node1 = 0;
        int node2 = 1;

        assertEquals(2, new FindClosestNodeToGivenTwoNodes().closestMeetingNode(edges, node1, node2));
    }

    @Test
    void shouldAlsoReturnTwo() {
        int[] edges = {1, 2, -1};
        int node1 = 0;
        int node2 = 2;

        assertEquals(2, new FindClosestNodeToGivenTwoNodes().closestMeetingNode(edges, node1, node2));
    }

}