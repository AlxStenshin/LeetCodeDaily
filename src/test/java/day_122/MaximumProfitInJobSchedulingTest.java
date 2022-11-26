package day_122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitInJobSchedulingTest {

    @Test
    void shouldGetMaxProfitEquals_120() {
        int[] startTime = new int[]{1, 2, 3, 3};
        int[] endTime = new int[]{3, 4, 5, 6};
        int[] profit = new int[]{50, 10, 40, 70};

        assertEquals(120, new MaximumProfitInJobScheduling().jobScheduling(startTime, endTime, profit));
    }

    @Test
    void shouldGetMaxProfitEquals_150() {
        int[] startTime = new int[]{1, 2, 3, 4, 6};
        int[] endTime = new int[]{3, 5, 10, 6, 9};
        int[] profit = new int[]{20, 20, 100, 70, 60};

        assertEquals(150, new MaximumProfitInJobScheduling().jobScheduling(startTime, endTime, profit));
    }
}