package day_118;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {

    @Test
    void shouldContainThreePerfectSquaresForInputTwelve() {
        assertEquals(3, new PerfectSquares().numSquares(12));
    }

    @Test
    void shouldContainTwoPerfectSquaresForInputThirteen() {
        assertEquals(2, new PerfectSquares().numSquares(13));
    }

}