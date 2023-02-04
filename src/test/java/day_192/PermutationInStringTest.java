package day_192;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void shouldReturnTrue() {
        String s1 = "ab";
        String s2 = "eibaooo";

        assertTrue(new PermutationInString().checkInclusion(s1, s2));
    }

    @Test
    void shouldReturnFalse() {
        String s1 = "ab";
        String s2 = "eidboaoo";

        assertFalse(new PermutationInString().checkInclusion(s1, s2));
    }

}