package day_128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfTwoStringsAreCloseTest {

    @Test
    void shouldReturnTrueInTwoOperations() {
        // Apply Operation 1: "abc" -> "acb"
        // Apply Operation 1: "acb" -> "bca"
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings("abc", "bca"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings("a", "aa"));
    }

    @Test
    void shouldReturnFalseWithRepeatableCharacterCount() {
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings("abbbzcf", "babzzcz"));
    }

    @Test
    void shouldReturnFalseWithUniqueCharactersInOneOfTheStrings() {
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings(
                "uiuiiuuiuuuuuuwiwuuwiiiiuuuuwwiwuuu",
                "rppprrpurrrrrurrrurprprprprpuprruur"));
    }

    @Test
    void shouldReturnTrueInThreeOperations() {
        // Apply Operation 1: "cabbba" -> "caabbb"
        // Apply Operation 2: "caabbb" -> "baaccc"
        // Apply Operation 2: "baaccc" -> "abbccc"
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings("cabbba", "abbccc"));
    }


}