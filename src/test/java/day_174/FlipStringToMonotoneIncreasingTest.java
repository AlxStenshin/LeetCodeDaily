package day_174;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipStringToMonotoneIncreasingTest {

    @Test
    void shouldReturnOne() {
        String input = "00110";
        assertEquals(1, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr(input));
    }

    @Test
    void shouldReturnTwo() {
        String input = "010110";
        assertEquals(2, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr(input));
    }

    @Test
    void shouldAlsoReturnTwo() {
        String input = "00011000";
        assertEquals(2, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr(input));
    }
}