package day_353;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href = "https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/" >
 * 1751. Maximum Number of Events That Can Be Attended II </a>
 * <p>
 * You are given an array of events where events[i] = [startDayi, endDayi, valuei]. The ith event starts at startDayi and ends at endDayi, and if you attend this event, you will receive a value of valuei. You are also given an integer k which represents the maximum number of events you can attend.
 * <p>
 * You can only attend one event at a time. If you choose to attend an event, you must attend the entire event. Note that the end day is inclusive: that is, you cannot attend two events where one of them starts and the other ends on the same day.
 * <p>
 * Return the maximum sum of values that you can receive by attending events.
 */

public class MaximumNumberOfEventsThatCanBeAttendedTwo {
    int[][] events;

    public int maxValue(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int n = events.length;

        dp = new int[k + 1][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, k);
    }

    private int[][] dp;

    private int dfs(int index, int count) {
        if (count == 0 || index == events.length) return 0;
        if (dp[count][index] != -1) {
            return dp[count][index];
        }

        int nextIndex = binarySearch(events[index][1]);
        dp[count][index] = Math.max(events[index][2] + dfs(nextIndex, count - 1), dfs(index + 1, count));
        return dp[count][index];
    }

    public int binarySearch(int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
