package day_075;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakPalindromeTest {

    @Test
    void shouldReturnBrokenPalindrome() {
        assertEquals("aaccba", new BreakPalindrome().breakPalindrome("abccba"));
    }

    @Test
    void shouldReturnEmptyString() {
        assertEquals("", new BreakPalindrome().breakPalindrome("a"));
    }

    @Test
    void shouldReplaceLastCharacterWithB() {
        assertEquals("aab", new BreakPalindrome().breakPalindrome("aaa"));
    }

    @Test
    void shouldReturnBrokenPalindromeForComplexInput() {
        assertEquals("aaabaab", new BreakPalindrome().breakPalindrome("aaabaaa"));
    }

    @Test
    void shouldReturnBrokenPalindromeForMoreComplexInput() {
        assertEquals("azxyyxzb", new BreakPalindrome().breakPalindrome("bzxyyxzb"));
    }

}