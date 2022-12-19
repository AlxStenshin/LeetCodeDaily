package day_145;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIfPathExistsInGraphTest {

    @Test
    void shouldReturnTrue() {
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;

        assertTrue(new FindIfPathExistsInGraph().validPath(n, edges, source, destination));
    }

    @Test
    void shouldReturnFalse() {
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 0;
        int destination = 5;

        assertFalse(new FindIfPathExistsInGraph().validPath(n, edges, source, destination));
    }

}