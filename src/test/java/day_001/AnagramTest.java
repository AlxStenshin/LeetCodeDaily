package day_001;

import org.junit.jupiter.api.Test;

import static day_001.Anagram.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void shouldReturnTrueWithNulls() {
        assertTrue(isAnagram(null, null));
    }

    @Test
    void shouldReturnFalseIfSourceIsNull() {
        assertFalse(isAnagram(null, ""));
    }

    @Test
    void shouldReturnTrueIfTargetIsNull() {
        assertTrue(isAnagram("", null));
    }

    @Test
    void shouldReturnTrueWithReorderedCharacters() {
        assertTrue(isAnagram("anagram", "anamagr"));
    }

    @Test
    void shouldReturnTrueWithReversedString() {
        assertTrue(isAnagram("Oppa", "appO"));
    }

    @Test
    void shouldReturnTrueWithSpaceBarDividedEqualStrings() {
        assertTrue(isAnagram("abc abc", "cba cba"));
    }

    @Test
    void shouldReturnFalseIfUnusedCharactersDetected() {
        assertFalse(isAnagram("aaaaa", "aaa"));
    }

}