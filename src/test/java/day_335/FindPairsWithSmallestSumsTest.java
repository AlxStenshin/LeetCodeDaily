package day_335;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPairsWithSmallestSumsTest {

    @Test
    void shouldReturnThreePairs() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;

        assertEquals(List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6)),
                new FindPairsWithSmallestSums().kSmallestPairs(nums1, nums2, k));
    }

    @Test
    void shouldReturnTwoPairs() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;

        assertEquals(List.of(List.of(1, 1), List.of(1, 1)),
                new FindPairsWithSmallestSums().kSmallestPairs(nums1, nums2, k));
    }

    @Test
    void shouldAlsoReturnTwoPairs() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        int k = 3;

        assertEquals(List.of(List.of(1, 3), List.of(2, 3)),
                new FindPairsWithSmallestSums().kSmallestPairs(nums1, nums2, k));
    }
}