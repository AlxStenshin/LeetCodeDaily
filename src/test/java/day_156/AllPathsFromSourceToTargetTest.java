package day_156;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPathsFromSourceToTargetTest {

    @Test
    void shouldReturnTwoPaths() {
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = List.of(
                List.of(0, 1, 3),
                List.of(0, 2, 3));

        assertEquals(expected, new AllPathsFromSourceToTarget().allPathsSourceTarget(graph));
    }

    @Test
    void shouldReturnFivePaths() {
        int[][] graph = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> expected = List.of(
                List.of(0, 4),
                List.of(0, 3, 4),
                List.of(0, 1, 3, 4),
                List.of(0, 1, 2, 3, 4),
                List.of(0, 1, 4));

        assertEquals(expected, new AllPathsFromSourceToTarget().allPathsSourceTarget(graph));
    }

}