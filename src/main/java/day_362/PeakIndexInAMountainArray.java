package day_362;

/**
 * <a href = "https://leetcode.com/problems/peak-index-in-a-mountain-array/" >
 * 852. Peak Index in a Mountain Array </a>
 * <p>
 * An array arr a mountain if the following properties hold:
 * <li>>arr.length >= 3
 * <li>>There exists some i with 0 < i < arr.length - 1 such that:
 * <li>>arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * <li>>arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <li>>Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * <p>
 * <br>You must solve it in O(log(arr.length)) time complexity.
 */

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1, midle;
        while (left < right) {
            midle = (left + right) / 2;
            if (arr[midle] < arr[midle + 1])
                left = midle + 1;
            else
                right = midle;
        }
        return left;
    }
}
