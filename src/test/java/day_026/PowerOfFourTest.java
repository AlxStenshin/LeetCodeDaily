package day_026;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {

    @Test
    void shouldReturnTrueWithInput_16() {
        assertTrue(new PowerOfFour().isPowerOfFour(16));
    }

    @Test
    void shouldReturnTrueWithInput_5() {
        assertFalse(new PowerOfFour().isPowerOfFour(5));
    }

    @Test
    void shouldReturnTrueWithInput_1() {
        assertTrue(new PowerOfFour().isPowerOfFour(1));
    }
}