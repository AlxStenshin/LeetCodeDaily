package day_085;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void shouldReturn_III() {
        assertEquals("III", new IntegerToRoman().intToRoman(3));
    }

    @Test
    void shouldReturn_LVIII() {
        assertEquals("LVIII", new IntegerToRoman().intToRoman(58));
    }

    @Test
    void shouldReturn_MCMXCIV() {
        assertEquals("MCMXCIV", new IntegerToRoman().intToRoman(1994));
    }

}