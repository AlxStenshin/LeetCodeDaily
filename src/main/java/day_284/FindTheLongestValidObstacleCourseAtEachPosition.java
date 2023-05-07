package day_284;
/**
 * <a href = "https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position/" >
 * 1964. Find the Longest Valid Obstacle Course at Each Position </a>
 * <p>
 * You are given an array of integers nums and an integer target.
 * <p>
 * Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.
 */

public class FindTheLongestValidObstacleCourseAtEachPosition {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int top = -1;
        int[] stack = new int[obstacles.length];
        int[] res = new int[obstacles.length];

        for (int i = 0; i < obstacles.length; i++) {
            if (top == -1 || obstacles[i] >= stack[top]) {
                stack[++top] = obstacles[i];
                res[i] = top + 1;
            } else {
                int left = 0, right = top, middle;
                while (left < right) {
                    middle = left + (right - left) / 2;
                    if (stack[middle] <= obstacles[i]) {
                        left = middle + 1;
                    } else {
                        right = middle;
                    }
                }

                stack[right] = obstacles[i];
                res[i] = right + 1;
            }
        }
        return res;
    }
}
