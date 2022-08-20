package day_024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfRefuelingStopsTest {

    @Test
    void shouldReturnZero() {
        assertEquals(0, new MinimumNumberOfRefuelingStops()
                .minRefuelStops(1, 1, new int[][]{}));
    }

    @Test
    void shouldReturnNone() {
        assertEquals(-1, new MinimumNumberOfRefuelingStops()
                .minRefuelStops(100, 1, new int[][]{new int[]{10,100}}));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new MinimumNumberOfRefuelingStops()
                .minRefuelStops(100, 10,
                        new int[][]{
                        new int[]{10, 60},
                        new int[]{20, 30},
                        new int[]{30, 30},
                        new int[]{60, 40}}));
    }
}