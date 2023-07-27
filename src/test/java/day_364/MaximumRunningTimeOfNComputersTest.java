package day_364;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumRunningTimeOfNComputersTest {

    @Test
    void shouldReturnTwo() {
        int n = 2;
        int[] batteries = {1, 1, 1, 1};
        assertEquals(2, new MaximumRunningTimeOfNComputers().maxRunTime(n, batteries));
    }

    @Test
    void shouldReturnFour() {
        int n = 2;
        int[] batteries = {3, 3, 3};
        assertEquals(4, new MaximumRunningTimeOfNComputers().maxRunTime(n, batteries));
    }
}