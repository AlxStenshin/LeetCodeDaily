package day_170;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPathWithDifferentAdjacentCharactersTest {

    @Test
    void shouldReturnThreeWithLongestPathZerOneThree() {
        int[] parent = {-1, 0, 0, 1, 1, 2};
        String s = "abacbe";

        assertEquals(3, new LongestPathWithDifferentAdjacentCharacters().longestPath(parent, s));
    }

    @Test
    void shouldReturnThreeWithLongestPathTwoZeroThree() {
        int[] parent = {-1, 0, 0, 0};
        String s = "aabc";

        assertEquals(3, new LongestPathWithDifferentAdjacentCharacters().longestPath(parent, s));
    }

}