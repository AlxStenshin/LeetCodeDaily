package day_099;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    @Test
    void shouldReturnSix() {
        assertEquals(6, new LongestPalindromeByConcatenatingTwoLetterWords()
                .longestPalindrome(new String[]{"lc", "cl", "gg"}));
    }

    @Test
    void shouldReturnEight() {
        assertEquals(8, new LongestPalindromeByConcatenatingTwoLetterWords()
                .longestPalindrome(new String[]{"ab", "ty", "yt", "lc", "cl", "ab"}));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new LongestPalindromeByConcatenatingTwoLetterWords()
                .longestPalindrome(new String[]{"cc", "ll", "xx"}));
    }
}