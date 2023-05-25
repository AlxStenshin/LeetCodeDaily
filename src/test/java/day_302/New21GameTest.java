package day_302;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class New21GameTest {

    @Test
    void shouldReturnOne() {
        int n = 10;
        int k = 1;
        int maxPts = 10;

        assertEquals(1.0d, new New21Game().new21Game(n, k, maxPts));
    }

    @Test
    void shouldReturnPointSix() {
        int n = 6;
        int k = 1;
        int maxPts = 10;

        assertEquals(0.6d, new New21Game().new21Game(n, k, maxPts));
    }

    @Test
    void shouldReturnPointSevenThreeSevenEight() {
        int n = 21;
        int k = 17;
        int maxPts = 10;

        assertEquals(0.7327777870686082d, new New21Game().new21Game(n, k, maxPts));
    }
}