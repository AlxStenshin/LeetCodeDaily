package day_261;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @Test
    void shouldReturnFour() {
        String input = "bbbab";
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindromeSubseq(input));
    }

    @Test
    void shouldReturnTwo() {
        String input = "cbbd";
        assertEquals(2, new LongestPalindromicSubsequence().longestPalindromeSubseq(input));
    }

}