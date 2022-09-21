package day_056;

import java.util.Arrays;

/**
 * <a href=https://leetcode.com/problems/sum-of-even-numbers-after-queries/">
 *    985. Sum of Even Numbers After Queries</a>
 * <p>
 * You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
 * <p>
 * For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
 * <p>
 * Return an integer array answer where answer[i] is the answer to the ith query.
 */

public class SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueriesOptimized(int[] nums, int[][] queries) {

        int evenSum = Arrays.stream(nums).filter(val -> (val % 2) == 0).sum();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = queries[i][1];
            int value = queries[i][0];

            if (nums[index] % 2 == 0)
                evenSum -= nums[index];

            nums[index] += value;

            if (nums[index] % 2 ==0)
                evenSum += nums[index];

            result[i] = evenSum;
        }
        return result;
    }

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[queries[i][1]] += queries[i][0];
            result[i] = Arrays.stream(nums).filter(val -> (val % 2) == 0).sum();
        }

        return result;
    }
}
