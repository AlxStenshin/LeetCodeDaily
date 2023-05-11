package day_288;

/**
 * <a href = "https://leetcode.com/problems/uncrossed-lines/" >
 * 1035. Uncrossed Lines </a>
 * <p>
 * You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given) on two separate horizontal lines.
 * <p>
 * We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:
 * <p>
 * nums1[i] == nums2[j], and the line we draw does not intersect any other connecting (non-horizontal) line.<br>
 * Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).
 * <p>
 * Return the maximum number of connecting lines we can draw in this way.
 */

public class UncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int firstLen = nums1.length;
        int secondLen = nums2.length;

        if (firstLen < secondLen) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            firstLen = nums1.length;
            secondLen = nums2.length;
        }

        int[] dp = new int[secondLen + 1];
        for (int i = 1; i <= firstLen; i++) {
            int prev = 0;
            for (int j = 1; j <= secondLen; j++) {
                int curr = dp[j];
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[j] = prev + 1;
                } else {
                    dp[j] = Math.max(dp[j - 1], curr);
                }
                prev = curr;
            }
        }
        return dp[secondLen];
    }
}
