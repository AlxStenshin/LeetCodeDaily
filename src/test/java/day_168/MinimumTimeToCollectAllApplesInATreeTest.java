package day_168;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeToCollectAllApplesInATreeTest {

    @Test
    void shouldReturnEight() {
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApple = List.of(false, false, true, false, true, true, false);

        assertEquals(8, new MinimumTimeToCollectAllApplesInATree().minTime(n, edges, hasApple));
    }

    @Test
    void shouldReturnSix() {
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApple = List.of(false, false, true, false, false, true, false);

        assertEquals(6, new MinimumTimeToCollectAllApplesInATree().minTime(n, edges, hasApple));
    }
}