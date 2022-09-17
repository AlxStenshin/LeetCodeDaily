package day_052;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePairsTest {

    @Test
    void shouldReturnFourPairs() {
        String[] input = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4));
        assertEquals(expected, new PalindromePairs().palindromePairs(input));
    }

    @Test
    void shouldReturnTwoPairs() {
        String[] input = new String[]{"bat", "tab", "cat"};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        assertEquals(expected, new PalindromePairs().palindromePairs(input));
    }

    @Test
    void shouldReturnTwoPairIfOneOfInputStringIsEmptyAndOtherOneIsPalindrome() {
        String[] input = new String[]{"a", ""};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        assertEquals(expected, new PalindromePairs().palindromePairs(input));
    }
}