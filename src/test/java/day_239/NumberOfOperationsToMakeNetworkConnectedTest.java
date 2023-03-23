package day_239;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOperationsToMakeNetworkConnectedTest {

    @Test
    void shouldReturnOne() {
        int n = 4;
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};

        assertEquals(1, new NumberOfOperationsToMakeNetworkConnected().makeConnected(n, connections));
    }

    @Test
    void shouldReturnTwo() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};

        assertEquals(2, new NumberOfOperationsToMakeNetworkConnected().makeConnected(n, connections));
    }

    @Test
    void shouldReturnMinusOne() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}};

        assertEquals(-1, new NumberOfOperationsToMakeNetworkConnected().makeConnected(n, connections));
    }

}