package day_066;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new DecodeWays().numDecodings("12"));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new DecodeWays().numDecodings("226"));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new DecodeWays().numDecodings("06"));
    }
}