package day_065;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheSkylineProblemTest {

    @Test
    void shouldReturnCorrectSkyline() {
        int[][] input = new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected = List.of(
                List.of(2, 10),
                List.of(3, 15),
                List.of(7, 12),
                List.of(12, 0),
                List.of(15, 10),
                List.of(20, 8),
                List.of(24, 0));

        assertEquals(expected, new TheSkylineProblem().getSkylineGreedySolution(input));
        assertEquals(expected, new TheSkylineProblem().getSkylineTreeMap(input));
    }


    @Test
    void shouldReturnCorrectSkylineWithSimpleInput() {
        int[][] input = new int[][]{{0, 2, 3}, {2, 5, 3}};
        List<List<Integer>> expected = List.of(
                List.of(0, 3),
                List.of(5, 0));

        assertEquals(expected, new TheSkylineProblem().getSkylineGreedySolution(input));
        assertEquals(expected, new TheSkylineProblem().getSkylineTreeMap(input));
    }

}