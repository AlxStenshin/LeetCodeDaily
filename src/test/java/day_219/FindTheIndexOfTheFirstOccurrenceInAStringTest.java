package day_219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void shouldReturnZero() {
        String haystack = "sadbutsad";
        String needle = "sad";

        assertEquals(0, new FindTheIndexOfTheFirstOccurrenceInAString().strStr(haystack, needle));
    }

    @Test
    void shouldReturnMinusOne() {
        String haystack = "leetcode";
        String needle = "leeto";

        assertEquals(-1, new FindTheIndexOfTheFirstOccurrenceInAString().strStr(haystack, needle));
    }

    @Test
    void shouldReturnZeroWithSingleCharInput() {
        String haystack = "a";
        String needle = "a";

        assertEquals(0, new FindTheIndexOfTheFirstOccurrenceInAString().strStr(haystack, needle));
    }

}