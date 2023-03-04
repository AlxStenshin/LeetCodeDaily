package day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void shouldReturnThree() {
        String s = "abcabcbb";
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    @Test
    void shouldReturnOne() {
        String s = "bbbbb";
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
    @Test
    void shouldAlsoReturnThree() {
        String s = "pwwkew";
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    @Test
    void shouldReturnThreeOpt() {
        String s = "abcabcbb";
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimized(s));
    }

    @Test
    void shouldReturnOneOpt() {
        String s = "bbbbb";
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimized(s));
    }
    @Test
    void shouldAlsoReturnThreeOpt() {
        String s = "pwwkew";
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimized(s));
    }

}