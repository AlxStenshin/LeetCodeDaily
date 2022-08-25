package day_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BullsAndCowsTest {

    @Test
    void shouldReturn_1A3B() {
        assertEquals("1A3B", new BullsAndCows().getHint("1807", "7810"));
    }

    @Test
    void shouldReturn_1A1B() {
        assertEquals("1A1B", new BullsAndCows().getHint("1123", "0111"));
    }
}