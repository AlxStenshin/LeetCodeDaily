package day_364;

/**
 * <a href = "https://leetcode.com/problems/maximum-running-time-of-n-computers/" >
 * 2141. Maximum Running Time of N Computers </a>
 * <p>
 * You have n computers. You are given the integer n and a 0-indexed integer array batteries where the ith battery can run a computer for batteries[i] minutes. You are interested in running all n computers simultaneously using the given batteries.
 * <p>
 * Initially, you can insert at most one battery into each computer. After that and at any integer time moment, you can remove a battery from a computer and insert another battery any number of times. The inserted battery can be a totally new battery or a battery from another computer. You may assume that the removing and inserting processes take no time.
 * <p>
 * Note that the batteries cannot be recharged.
 * <p>
 * Return the maximum number of minutes you can run all the n computers simultaneously.
 */

public class MaximumRunningTimeOfNComputers {

    public long maxRunTime(int n, int[] batteries) {
        long batSum = 0;
        for (int bat : batteries) {
            batSum += bat;
        }

        long left = 0;
        long right = batSum / n;
        long res = -1;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (fits(n, mid, batteries)) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }

    private boolean fits(int n, long k, int[] batteries) {
        long currBatSum = 0;
        long target = n * k;

        for (int bat : batteries) {
            if (bat < k) {
                currBatSum += bat;
            } else {
                currBatSum += k;
            }

            if (currBatSum >= target) {
                return true;
            }
        }
        return currBatSum >= target;
    }
}
