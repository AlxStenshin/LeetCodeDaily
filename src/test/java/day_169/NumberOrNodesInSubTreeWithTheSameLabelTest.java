package day_169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOrNodesInSubTreeWithTheSameLabelTest {

    @Test
    void shouldReturnTwoForFirstNodeAndOneForOthers() {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        String labels = "abaedcd";
        int[] expected = {2, 1, 1, 1, 1, 1, 1};

        assertArrayEquals(expected, new NumberOrNodesInSubTreeWithTheSameLabel().countSubTrees(n, edges, labels));
    }

    @Test
    void shouldReturnFourForFirstNodeTwoForSecondAndOneForOthers() {
        int n = 4;
        int[][] edges = {{0, 1}, {1, 2}, {0, 3}};
        String labels = "bbbb";
        int[] expected = {4, 2, 1, 1};

        assertArrayEquals(expected, new NumberOrNodesInSubTreeWithTheSameLabel().countSubTrees(n, edges, labels));
    }

    @Test
    void shouldReturnThreeForFirstNodeTwoForSecondAndOneForOthers() {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {0, 4}};
        String labels = "aabab";
        int[] expected = {3, 2, 1, 1, 1};

        assertArrayEquals(expected, new NumberOrNodesInSubTreeWithTheSameLabel().countSubTrees(n, edges, labels));
    }

}