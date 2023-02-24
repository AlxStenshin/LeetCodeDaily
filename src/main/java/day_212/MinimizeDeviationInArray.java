package day_212;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/minimize-deviation-in-array/">
 * 1675. Minimize Deviation in Array </a>
 * <p>
 * You are given an array nums of n positive integers.
 * <p>
 * You can perform two types of operations on any element of the array any number of times:
 * <p>
 * If the element is even, divide it by 2.<br>
 * For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
 * <p>
 * If the element is odd, multiply it by 2.<br>
 * For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
 * <p>
 * The deviation of the array is the maximum difference between any two elements in the array.
 * */

public class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int minVal = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num % 2 == 1)
                num = num * 2;
            pq.offer(num);
            minVal = Math.min(minVal, num);
        }

        int minDeviation = Integer.MAX_VALUE;
        while (true) {
            int maxVal = pq.poll();
            minDeviation = Math.min(minDeviation, maxVal - minVal);

            if (maxVal % 2 == 1)
                break;

            maxVal = maxVal / 2;
            minVal = Math.min(minVal, maxVal);
            pq.offer(maxVal);
        }

        return minDeviation;
    }
}
