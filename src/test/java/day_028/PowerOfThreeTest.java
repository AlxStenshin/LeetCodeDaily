package day_028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void shouldReturnCorrectValues() {
        PowerOfThree pot = new PowerOfThree();
        assertTrue(pot.isPowerOfThree(243));
        assertTrue(pot.isPowerOfThree(27));
        assertFalse(pot.isPowerOfThree(0));
        assertTrue(pot.isPowerOfThree(9));
    }
}