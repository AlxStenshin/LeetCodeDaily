package day_301;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubsequenceScoreTest {

    @Test
    void shouldReturnTwelve() {
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int k = 3;

        assertEquals(12, new MaximumSubsequenceScore().maxScore(nums1, nums2, k));
    }

    @Test
    void shouldReturnThirty() {
        int[] nums1 = {4,2,3,1,1};
        int[] nums2 = {7,5,10,9,6};
        int k = 1;

        assertEquals(30, new MaximumSubsequenceScore().maxScore(nums1, nums2, k));
    }
}