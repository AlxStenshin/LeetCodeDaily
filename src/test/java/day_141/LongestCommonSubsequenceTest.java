package day_141;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    void shouldReturnThree() {
        assertEquals(3, new LongestCommonSubsequence().longestCommonSubsequence("abcde", "ace"));
    }
    @Test
    void shouldReturnAlsoThree() {
        assertEquals(3, new LongestCommonSubsequence().longestCommonSubsequence("abc", "abc"));
    }
    @Test
    void shouldReturnZero() {
        assertEquals(0, new LongestCommonSubsequence().longestCommonSubsequence("abc", "def"));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new LongestCommonSubsequence().longestCommonSubsequence("ezupkr", "ubmrapg"));
    }

}