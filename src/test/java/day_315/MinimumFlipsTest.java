package day_315;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFlipsTest {

    @Test
    void shouldReturnThree() {
        int a = 2;
        int b = 6;
        int c = 5;

        assertEquals(3, new MinimumFlips().minFlips(a, b, c));
    }

    @Test
    void shouldReturnOne() {
        int a = 4;
        int b = 2;
        int c = 7;

        assertEquals(1, new MinimumFlips().minFlips(a, b, c));
    }

    @Test
    void shouldReturnZero() {
        int a = 1;
        int b = 2;
        int c = 3;

        assertEquals(0, new MinimumFlips().minFlips(a, b, c));
    }
}