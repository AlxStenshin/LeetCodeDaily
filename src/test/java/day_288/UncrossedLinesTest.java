package day_288;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UncrossedLinesTest {

    @Test
    void shouldReturnTwoUncrossedLines() {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};

        assertEquals(2, new UncrossedLines().maxUncrossedLines(nums1, nums2));
    }

    @Test
    void shouldAlsoReturnTwoUncrossedLines() {
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};

        assertEquals(2, new UncrossedLines().maxUncrossedLines(nums1, nums2));
    }

    @Test
    void shouldReturnThreeUncrossedLines() {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};

        assertEquals(3, new UncrossedLines().maxUncrossedLines(nums1, nums2));
    }

}