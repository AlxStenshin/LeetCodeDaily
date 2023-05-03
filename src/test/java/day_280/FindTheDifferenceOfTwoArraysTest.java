package day_280;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArraysTest {

    @Test
    void shouldReturnListOfOneTwoAndListOfFourSix() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> expected = List.of(List.of(1, 3), List.of(4, 6));
        assertEquals(expected, new FindTheDifferenceOfTwoArrays().findDifference(nums1, nums2));
    }

    @Test
    void shouldReturnListOfThreeAndListOf() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<List<Integer>> expected = List.of(List.of(3), List.of());
        assertEquals(expected, new FindTheDifferenceOfTwoArrays().findDifference(nums1, nums2));
    }

}