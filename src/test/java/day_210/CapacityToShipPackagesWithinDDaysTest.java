package day_210;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapacityToShipPackagesWithinDDaysTest {

    @Test
    void shouldReturn_15() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int expected = 15;

        assertEquals(expected, new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days));
    }

    @Test
    void shouldReturn_6() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int expected = 6;

        assertEquals(expected, new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days));
    }

    @Test
    void shouldReturn_3() {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        int expected = 3;

        assertEquals(expected, new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days));
    }

}