package day_242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCycleInAGraphTest {

    @Test
    void shouldReturnThree() {
        int[] edges = {3, 3, 4, 2, 3};
        assertEquals(3, new LongestCycleInAGraph().longestCycle(edges));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] edges = {2, -1, 3, 1};
        assertEquals(-1, new LongestCycleInAGraph().longestCycle(edges));
    }

}