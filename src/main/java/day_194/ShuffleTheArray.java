package day_194;

/**
 * <a href = "https://leetcode.com/problems/shuffle-the-array/">
 * 1470. Shuffle the Array </a>
 * <p>
 * TGiven the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int currSize = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[currSize] = nums[i];
            arr[currSize + 1] = nums[i + n];
            currSize += 2;
        }
        return arr;
    }
}
