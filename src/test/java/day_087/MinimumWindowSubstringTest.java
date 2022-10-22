package day_087;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    void shouldReturn_BANC() {
        assertEquals("BANC",new MinimumWindowSubstring().minWindow("ADOBECODEBANC",  "ABC"));
    }

    @Test
    void shouldReturn_a() {
        assertEquals("a",new MinimumWindowSubstring().minWindow("a",  "a"));
    }

    @Test
    void shouldReturn_EmptyString() {
        assertEquals("",new MinimumWindowSubstring().minWindow("a",  "aa"));
    }
}