package day_148;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDistancesInTreeTest {

    @Test
    void shouldReturnCorrectArray() {
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        int[] expected = new int[]{8, 12, 6, 10, 10, 10};

        assertArrayEquals(expected, new SumOfDistancesInTree().sumOfDistancesInTree(n, edges));
    }

    @Test
    void shouldReturnSingleZeroElementArray() {
        int n = 1;
        int[][] edges = new int[][]{};
        int[] expected = new int[]{0};

        assertArrayEquals(expected, new SumOfDistancesInTree().sumOfDistancesInTree(n, edges));
    }

    @Test
    void shouldReturnTwoElementsArray() {
        int n = 2;
        int[][] edges = new int[][]{{1, 0}};
        int[] expected = new int[]{1, 1};

        assertArrayEquals(expected, new SumOfDistancesInTree().sumOfDistancesInTree(n, edges));
    }

}