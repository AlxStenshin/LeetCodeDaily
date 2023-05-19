package day_296;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BipartiteGraphTest {

    @Test
    void shouldReturnFalse() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertFalse(new BipartiteGraph().isBipartite(graph));
    }

    @Test
    void shouldReturnTrue() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertTrue(new BipartiteGraph().isBipartite(graph));
    }

}