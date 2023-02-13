package day_201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersInAnIntervalRangeTest {

    @Test
    void shouldReturnThree() {
        int low = 3;
        int high = 7;
        int expected = 3;

        assertEquals(expected, new CountOddNumbersInAnIntervalRange().countOdds(low, high));
    }

    @Test
    void shouldReturnOne() {
        int low = 8;
        int high = 10;
        int expected = 1;

        assertEquals(expected, new CountOddNumbersInAnIntervalRange().countOdds(low, high));
    }
    @Test
    void shouldReturnFive() {
        int low = 0;
        int high = 10;
        int expected = 5;

        assertEquals(expected, new CountOddNumbersInAnIntervalRange().countOdds(low, high));
    }

}