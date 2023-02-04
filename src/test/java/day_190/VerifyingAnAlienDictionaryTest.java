package day_190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyingAnAlienDictionaryTest {

    @Test
    void shouldReturnTrueWithFirstLetterReplacement() {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        assertTrue(new VerifyingAnAlienDictionary().isAlienSorted(words, order));
    }

    @Test
    void shouldReturnFalse() {
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";

        assertFalse(new VerifyingAnAlienDictionary().isAlienSorted(words, order));
    }

    @Test
    void shouldReturnFalseWithSecondShorterString() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";

        assertFalse(new VerifyingAnAlienDictionary().isAlienSorted(words, order));
    }

}