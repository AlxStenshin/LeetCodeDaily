package day_006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestTest {

    /**
     * Example 1:
     * <p>
     * Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
     * Output: 13
     * Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
     */
    @Test
    void shouldReturnThirteen() {
        assertEquals(13, new KthSmallest().kthSmallest(new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}}, 8));
    }

    @Test
    void shouldReturnThirteen_BinarySearch() {
        assertEquals(13, new KthSmallest().binarySearchSolution(new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}}, 8));
    }

    /**
     * Example 2:
     * <p>
     * Input: matrix = [[-5]], k = 1
     * Output: -5
     */
    @Test
    void shouldReturnMinusFive() {
        assertEquals(-5, new KthSmallest().kthSmallest(new int[][]{{-5}}, 1));
        assertEquals(-5, new KthSmallest().binarySearchSolution(new int[][]{{-5}}, 1));
    }

    /**
     * Example 3:
     * <p>
     * Input: matrix = [[1,2],[1,3]], k = 2
     * Output: 1
     */
    @Test
    void shouldReturnOne() {
        assertEquals(1, new KthSmallest().kthSmallest(new int[][]{
                        {1, 2},
                        {1, 3}},
                2));

        assertEquals(1, new KthSmallest().binarySearchSolution(new int[][]{
                        {1, 2},
                        {1, 3}},
                2));
    }
}