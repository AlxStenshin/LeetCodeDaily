package day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void shouldReturn_fl() {
        String[] strs = {"flower", "flow", "flight"};

        assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    @Test
    void shouldReturnEmptyString() {
        String[] strs = {"dog", "racecar", "car"};

        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}