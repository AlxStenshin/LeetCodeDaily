package day_240;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    @Test
    void shouldReturnThree() {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        assertEquals(3, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections));
    }

    @Test
    void shouldReturnTwo() {
        int n = 5;
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};

        assertEquals(2, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections));
    }

    @Test
    void shouldReturnZero() {
        int n = 3;
        int[][] connections = {{1, 0}, {2, 0}};

        assertEquals(0, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections));
    }

}