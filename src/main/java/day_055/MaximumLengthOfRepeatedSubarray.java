package day_055;

/**
 * <a href=https://leetcode.com/problems/maximum-length-of-repeated-subarray/">
 *     718. Maximum Length of Repeated Subarray</a>
 * <p>
 * Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
 */


/*
    nums1 = [1,2,4,5]
    nums2 = [5,7,2,4]

             1     2     4     5
    |-----------------------------|
    |  0  |  0  |  0  |  0  |  0  |
    |-----------------------------|
  5 |  0  |  0  |  0  |  0  |  1  |
    |-----------------------------|
  7 |  0  |  0  |  0  |  0  |  0  |
    |-----------------------------|
  2 |  0  |  0  |  1  |  0  |  0  |
    |-----------------------------|
  4 |  0  |  0  |  0  |  2  |  0  |
    |-----------------------------|

*/

public class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] nums1, int[] nums2) {
        int firstSize = nums1.length, secondSize = nums2.length;

        int max = 0;
        int[][] dp = new int[firstSize + 1][secondSize + 1];

        for (int i = 1; i <= firstSize; i++) {
            for (int j = 1; j <= secondSize; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
}
