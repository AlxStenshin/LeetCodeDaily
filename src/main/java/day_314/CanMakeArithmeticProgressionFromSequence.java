package day_314;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/" >
 * 1502. Can Make Arithmetic Progression From Sequence </a>
 * <p>
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 * <p>
 * Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
 */

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int delta = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < arr.length; i++) {
            if (delta != arr[i] - arr[i - 1])
                return false;
        }
        return true;
    }
}
