package day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {

    @Test
    void shouldReturnLinearIncreasingArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                new RunningSum().runningSum(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void shouldReturnCorrectRunningSum() {
        assertArrayEquals(new int[]{1, 3, 6, 10},
                new RunningSum().runningSum(new int[]{1, 2, 3, 4}));
    }
}