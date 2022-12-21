package day_147;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PossibleBipartitionTest {

    @Test
    void shouldReturnTrue() {
        int n = 4;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 4}};
        assertTrue(new PossibleBipartition().possibleBipartition(n, dislikes));
    }

    @Test
    void shouldReturnFalse() {
        int n = 3;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        assertFalse(new PossibleBipartition().possibleBipartition(n, dislikes));
    }

    @Test
    void shouldAlsoReturnFalse() {
        int n = 5;
        int[][] dislikes = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertFalse(new PossibleBipartition().possibleBipartition(n, dislikes));
    }
}