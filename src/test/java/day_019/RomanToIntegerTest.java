package day_019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void shouldReturn_1994() {
        assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
    }

    @Test
    void shouldReturn_58() {
        assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
    }

    @Test
    void shouldReturn_3() {
        assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

}