package day_325;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/make-array-strictly-increasing/" >
 * 1187. Make Array Strictly Increasing</a>
 * <p>
 * Given an array nums that represents a permutation of integers from 1 to n. We are going to construct a binary search tree (BST) by inserting the elements of nums in order into an initially empty BST. Find the number of different ways to reorder nums so that the constructed BST is identical to that formed from the original array nums.
 * <p>
 * For example, given nums = [2,1,3], we will have 2 as the root, 1 as a left child, and 3 as a right child. The array [2,3,1] also yields the same BST but [3,2,1] yields a different BST.
 * <p>
 * Return the number of ways to reorder nums such that the BST formed is identical to the original BST formed from nums.
 * <p>
 * Since the answer may be very large, return it modulo 109 + 7.
 */

public class MakeArrayStrictlyIncreasing {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(TreeSet::new));
        int[] dp = new int[arr2.length + 1];
        dp[0] = -1;
        int INF = (int) 2e9;

        for (int k : arr1) {
            for (int j = arr2.length; j >= 0; j--) {
                int a = k > dp[j] ? k : INF;
                Integer b = set.higher(j == 0 ? INF : dp[j - 1]);
                dp[j] = Math.min(a, b == null ? INF : b);
            }
        }

        for (int i = 0; i <= arr2.length; i++)
            if (dp[i] != INF) {
                return i;
            }

        return -1;
    }
}
