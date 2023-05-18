package day_295;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfVerticesToReachAllNodesTest {

    @Test
    void shouldReturnZeroThree() {
        List<List<Integer>> edges = List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2));
        List<Integer> expected = List.of(0, 3);
        int n = 6;

        assertEquals(expected, new MinimumNumberOfVerticesToReachAllNodes().findSmallestSetOfVertices(n, edges));
    }

    @Test
    void shouldReturnZeroTwoThree() {
        List<List<Integer>> edges = List.of(List.of(0, 1), List.of(2, 1), List.of(3, 1), List.of(1, 4), List.of(2, 4));
        List<Integer> expected = List.of(0, 2, 3);
        int n = 5;

        assertEquals(expected, new MinimumNumberOfVerticesToReachAllNodes().findSmallestSetOfVertices(n, edges));
    }

}