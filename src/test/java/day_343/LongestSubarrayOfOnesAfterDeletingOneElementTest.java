package day_343;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOfOnesAfterDeletingOneElementTest {

    @Test
    void shouldReturnThree() {
        int[] nums = {1, 1, 0, 1};
        assertEquals(3, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(nums));
    }

    @Test
    void shouldReturnFive() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertEquals(5, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(nums));
    }

    @Test
    void shouldReturnTwo() {
        int[] nums = {1, 1, 1};
        assertEquals(2, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(nums));
    }

}