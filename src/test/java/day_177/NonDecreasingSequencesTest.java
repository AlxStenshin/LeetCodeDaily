package day_177;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDecreasingSequencesTest {

    @Test
    void shouldReturnEightSubsequences() {
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> expected = List.of(
                List.of(4, 6),
                List.of(4, 6, 7),
                List.of(4, 6, 7, 7),
                List.of(4, 7),
                List.of(4, 7, 7),
                List.of(6, 7),
                List.of(6, 7, 7),
                List.of(7, 7));

        assertEquals(expected, new NonDecreasingSequences().findSubsequences(nums));
    }

    @Test
    void shouldReturnOneSubsequence() {
        int[] nums = {4, 4, 3, 2, 1};
        List<List<Integer>> expected = List.of(List.of(4, 4));

        assertEquals(expected, new NonDecreasingSequences().findSubsequences(nums));
    }

}