package day_222;

/**
 * <a href = "https://leetcode.com/problems/kth-missing-positive-number/">
 * 1539. Kth Missing Positive Number </a>
 * <p>
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * <p>
 * Return the kth positive integer that is missing from this array.
 */

public class KthMissingPositiveNumber {
    public int findKthPositive_BinarySearch(int[] arr, int k) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int missingCount = arr[midIndex] - midIndex - 1;
            if (missingCount < k)
                leftIndex = midIndex + 1;
            else
                rightIndex = midIndex - 1;
        }
        return leftIndex + k;
    }

    public int findKthPositiveOn(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k)  k++;
            else break;
        }
        return k;
    }
}
