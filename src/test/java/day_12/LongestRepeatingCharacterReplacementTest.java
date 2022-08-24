package day_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void shouldReturnFour() {
        assertEquals(4, new LongestRepeatingCharacterReplacement().characterReplacement("ABBA", 2));
    }

    @Test
    void shouldReturnFourWithBiggerData() {
        assertEquals(4, new LongestRepeatingCharacterReplacement().characterReplacement("AABABBA", 1));
    }

}