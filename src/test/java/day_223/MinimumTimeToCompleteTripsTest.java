package day_223;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeToCompleteTripsTest {

    @Test
    void shouldReturnThree() {
        int[] time = {1, 2, 3};
        int totalTrips = 5;

        assertEquals(3, new MinimumTimeToCompleteTrips().minimumTime(time, totalTrips));
    }

    @Test
    void shouldReturnTwo() {
        int[] time = {2};
        int totalTrips = 1;

        assertEquals(2, new MinimumTimeToCompleteTrips().minimumTime(time, totalTrips));
    }
}