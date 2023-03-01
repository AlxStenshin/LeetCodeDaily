package day_217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAnArrayTest {

    @Test
    void shouldReturnSortedArrayOfOneTwoThreeFive_Merge() {
        int[] nums = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Merge(nums));
    }

    @Test
    void shouldReturnSortedArrayOfZeroZeroOneOneTwoFive_Merge() {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Merge(nums));
    }

    @Test
    void shouldReturnSortedArrayOfOneTwoThreeFive_Heap() {
        int[] nums = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Heap(nums));
    }

    @Test
    void shouldReturnSortedArrayOfZeroZeroOneOneTwoFive_Heap() {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Heap(nums));
    }

    @Test
    void shouldReturnSortedArrayOfOneTwoThreeFive_Counting() {
        int[] nums = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Counting(nums));
    }

    @Test
    void shouldReturnSortedArrayOfZeroZeroOneOneTwoFive_Counting() {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Counting(nums));
    }

    @Test
    void shouldReturnSortedArrayOfOneTwoThreeFive_Radix() {
        int[] nums = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Radix(nums));
    }

    @Test
    void shouldReturnSortedArrayOfZeroZeroOneOneTwoFive_Radix() {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};

        assertArrayEquals(expected, new SortAnArray().sortArray_Radix(nums));
    }

}