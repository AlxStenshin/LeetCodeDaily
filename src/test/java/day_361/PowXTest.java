package day_361;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowXTest {

    @Test
    void shouldReturnDotTwoFive() {
        assertEquals(0.25d, new PowX().myPow(2.0d, -2));
    }

    @Test
    void shouldReturnOneThousandTwentyFour() {
        assertEquals(1024.0d, new PowX().myPow(2.0d, 10));
    }

    @Test
    void shouldReturnNineTwoSixOne() {
        assertEquals(9.261000000000001d, new PowX().myPow(2.1d, 3));
    }

}