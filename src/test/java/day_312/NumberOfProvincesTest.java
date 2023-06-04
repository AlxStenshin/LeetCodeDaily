package day_312;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    @Test
    void shouldReturnTwo() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        assertEquals(2, new NumberOfProvinces().findCircleNum(isConnected));
    }

    @Test
    void shouldReturnThree() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, new NumberOfProvinces().findCircleNum(isConnected));
    }

}