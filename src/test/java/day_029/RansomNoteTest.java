package day_029;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new RansomNote().canConstruct("aa", "aab"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new RansomNote().canConstruct("a", "b"));
    }

}