package day_090;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(
                new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    @Test
    void shouldAlsoReturnTrue() {
        assertTrue(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(
                new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    @Test
    void shouldReturnFalse() {
        assertTrue(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(
                new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }

}