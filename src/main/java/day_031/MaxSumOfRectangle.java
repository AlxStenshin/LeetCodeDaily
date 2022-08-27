package day_031;

/**
 * 363. Max Sum of Rectangle No Larger Than K
 * https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/
 *
 * Given an m x n matrix matrix and an integer k,
 * return the max sum of a rectangle in the matrix such that its sum is no larger than k.
 *
 * It is guaranteed that there will be a rectangle with a sum no larger than k.
 */

public class MaxSumOfRectangle {
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int[] a = new int[m];
            for (int j = i; j < n; j++) {
                for (int x = 0; x < m; x++)
                    a[x] += matrix[j][x];

                int sum = getSum(a, k);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int getSum(int[] a, int k) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int s = 0;
            for (int j = i; j < a.length; j++) {
                s += a[j];
                if (s <= k)
                    ans = Math.max(ans, s);
            }
        }
        return ans;
    }
}
