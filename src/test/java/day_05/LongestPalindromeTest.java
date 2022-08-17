package day_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void shouldReturnSeven() {
        assertEquals(7, new LongestPalindrome().longestPalindrome("abccccdd"));
    }
    @Test
    void shouldReturnOne() {
        assertEquals(1, new LongestPalindrome().longestPalindrome("a"));
    }
    @Test
    void shouldReturnTwo() {
        assertEquals(2, new LongestPalindrome().longestPalindrome("bb"));
    }
}