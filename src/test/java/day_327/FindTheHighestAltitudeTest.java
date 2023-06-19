package day_327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {

    @Test
    void shouldReturnZero() {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        assertEquals(0, new FindTheHighestAltitude().largestAltitude(gain));
    }

    @Test
    void shouldReturnOne() {
        int[] gain = {-5, 1, 5, 0, -7};
        assertEquals(1, new FindTheHighestAltitude().largestAltitude(gain));
    }

}