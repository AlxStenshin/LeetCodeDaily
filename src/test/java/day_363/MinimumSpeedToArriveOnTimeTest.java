package day_363;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSpeedToArriveOnTimeTest {

    @Test
    void shouldReturnOne() {
        int[] dist = {1, 3, 2};
        double hour = 6;
        assertEquals(1, new MinimumSpeedToArriveOnTime().minSpeedOnTime(dist, hour));
    }

    @Test
    void shouldReturnThree() {
        int[] dist = {1, 3, 2};
        double hour = 2.7d;
        assertEquals(3, new MinimumSpeedToArriveOnTime().minSpeedOnTime(dist, hour));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] dist = {1, 3, 2};
        double hour = 1.9d;
        assertEquals(-1, new MinimumSpeedToArriveOnTime().minSpeedOnTime(dist, hour));
    }

}