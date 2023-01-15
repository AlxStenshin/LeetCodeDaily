package day_172;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPathsTest {

    @Test
    void shouldReturnSix() {
        int[] vals = {1,3,2,1,3};
        int[][] edges = {{0,1}, {0,2}, {2,3}, {2,4}};

        assertEquals(6, new NumberOfGoodPaths().numberOfGoodPaths(vals, edges));
    }

    @Test
    void shouldReturnSeven() {
        int[] vals = {1,1,2,2,3};
        int[][] edges = {{0,1}, {1,2}, {2,3}, {2,4}};

        assertEquals(7, new NumberOfGoodPaths().numberOfGoodPaths(vals, edges));
    }

    @Test
    void shouldReturnOne() {
        int[] vals = {1};
        int[][] edges = {};

        assertEquals(1, new NumberOfGoodPaths().numberOfGoodPaths(vals, edges));
    }

}