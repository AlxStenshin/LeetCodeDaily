package day_273;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new AddDigits().addDigits(38));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new AddDigits().addDigits(0));
    }

}