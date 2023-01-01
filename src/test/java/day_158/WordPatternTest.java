package day_158;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void shouldReturnTrue() {
        String pattern = "abba";
        String s = "dog cat cat dog";

        assertTrue(new WordPattern().wordPattern(pattern, s));
    }

    @Test
    void shouldReturnFalseIfStringBreaksPattern() {
        String pattern = "abba";
        String s = "dog cat cat fish";

        assertFalse(new WordPattern().wordPattern(pattern, s));
    }

    @Test
    void shouldReturnFalseIfPatternDoesNotMatchString() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";

        assertFalse(new WordPattern().wordPattern(pattern, s));
    }

    @Test
    void shouldReturnFalse() {
        String pattern = "abba";
        String s = "dog dog dog dog";

        assertFalse(new WordPattern().wordPattern(pattern, s));
    }
}