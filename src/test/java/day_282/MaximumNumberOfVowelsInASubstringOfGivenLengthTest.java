package day_282;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    @Test
    void shouldReturnThree() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

    @Test
    void shouldReturnTwo() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

    @Test
    void shouldAlsoReturnTwo() {
        String s = "leetcode";
        int k = 3;
        int expected = 2;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

    @Test
    void shouldAlsoReturnFour() {
        String s = "weallloveyou";
        int k = 7;
        int expected = 4;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

 @Test
    void shouldReturnThree_slow() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels_slow(s, k));
    }

    @Test
    void shouldReturnTwo_slow() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels_slow(s, k));
    }

    @Test
    void shouldAlsoReturnTwo_slow() {
        String s = "leetcode";
        int k = 3;
        int expected = 2;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels_slow(s, k));
    }

    @Test
    void shouldAlsoReturnFour_slow() {
        String s = "weallloveyou";
        int k = 7;
        int expected = 4;

        assertEquals(expected, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels_slow(s, k));
    }



}