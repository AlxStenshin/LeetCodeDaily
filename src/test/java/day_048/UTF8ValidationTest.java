package day_048;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UTF8ValidationTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new UTF8Validation().validUtf8(new int[]{197, 130, 1}));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new UTF8Validation().validUtf8(new int[]{235, 140, 4}));
    }

}