package day_290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountWaysToBuildGoodStringsTest {
    @Test
    void shouldReturnEight() {
        int low = 3, high = 3, zero = 1, one = 1;
        assertEquals(8, new CountWaysToBuildGoodStrings().countGoodStrings(low, high, zero, one));
    }

    @Test
    void shouldReturnFive() {
        int low = 2, high = 3, zero = 1, one = 2;
        assertEquals(5, new CountWaysToBuildGoodStrings().countGoodStrings(low, high, zero, one));
    }
}