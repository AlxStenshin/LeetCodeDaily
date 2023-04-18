package day_265;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void shouldReturn_apbqcr() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";

        assertEquals(expected, new MergeStringsAlternately().mergeAlternately(word1, word2));
    }

    @Test
    void shouldReturn_apbqrs() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";

        assertEquals(expected, new MergeStringsAlternately().mergeAlternately(word1, word2));
    }

    @Test
    void shouldReturn_apbqcd() {
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";

        assertEquals(expected, new MergeStringsAlternately().mergeAlternately(word1, word2));
    }
}