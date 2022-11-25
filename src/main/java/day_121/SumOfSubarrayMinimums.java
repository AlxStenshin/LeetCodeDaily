package day_121;

import java.util.Arrays;
import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/sum-of-subarray-minimums/">
 * 907. Sum of Subarray Minimums </a>
 * <p>
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 10^9 + 7.
 */

public class SumOfSubarrayMinimums {

    public int sumArrayMinBruteForce(int[] arr) {
        int minSum = 0;
        for (int windowSize = 1; windowSize <= arr.length; windowSize++) {
            for (int windowOffset = 0;  windowOffset <= (arr.length - windowSize); windowOffset++) {
                int[] targetArray = Arrays.copyOfRange(arr, windowOffset, windowOffset + windowSize);
                Arrays.sort(targetArray);
                minSum += targetArray[0];
            }
        }
        return minSum;
    }

    public int sumSubarrayMin(int[] arr) {
        long res = 0;
        Stack<Integer> stack = new Stack<>();
        long M = (long)1e9 + 7;
        stack.push(-1);

        for (int i2 = 0; i2 < arr.length+1; i2++){
            int currVal = (i2<arr.length)? arr[i2] : 0;

            while(stack.peek() !=-1 && currVal < arr[stack.peek()]) {
                int index = stack.pop();
                int i1 = stack.peek();
                int left = index - i1;
                int right = i2 - index;
                long add = left * right * (long)arr[index] % M;
                res += add ;
                res %= M;
            }
            stack.push(i2);
        }
        return (int)res;
    }
}
