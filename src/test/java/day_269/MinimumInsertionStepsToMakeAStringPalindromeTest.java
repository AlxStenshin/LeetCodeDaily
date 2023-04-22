package day_269;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumInsertionStepsToMakeAStringPalindromeTest {

    @Test
    void shouldReturnZero() {
        String input = "zzazz";
        int expected = 0;
        assertEquals(expected, new MinimumInsertionStepsToMakeAStringPalindrome().minInsertions(input));
    }

    @Test
    void shouldReturnTwo() {
        String input = "mbadm";
        int expected = 2;
        assertEquals(expected, new MinimumInsertionStepsToMakeAStringPalindrome().minInsertions(input));
    }

    @Test
    void shouldReturnFive() {
        String input = "leetcode";
        int expected = 5;
        assertEquals(expected, new MinimumInsertionStepsToMakeAStringPalindrome().minInsertions(input));
    }

}