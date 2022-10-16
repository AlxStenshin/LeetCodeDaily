package day_081;

/**
 * <a href="https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/">
 *  1335. Minimum Difficulty of a Job Schedule</a>
 * <p>
 * You want to schedule a list of jobs in d days. Jobs are dependent (i.e To work on the ith job, you have to finish all the jobs j where 0 <= j < i).
 * <p>
 * You have to finish at least one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the d days. The difficulty of a day is the maximum difficulty of a job done on that day.
 * <p>
 * You are given an integer array jobDifficulty and an integer d. The difficulty of the ith job is jobDifficulty[i].
 * <p>
 * Return the minimum difficulty of a job schedule. If you cannot find a schedule for the jobs return -1.
 */

public class MinimumDifficultyOfAJobSchedule {
    Integer[][] dp;
    int size;

    public int minDifficulty(int[] jobDifficulty, int d) {
        size = jobDifficulty.length;
        dp = new Integer[size][d + 1];

        if (size < d)
            return -1;

        return helper(0, jobDifficulty, d);
    }

    public int helper(int idx, int[] arr, int d) {
        if (idx == size && d == 0)
            return 0;

        if (size - idx < d)
            return (int) 1e5;          // only for optimization not necessary

        if (d < 0)
            return (int) 1e5;

        if (dp[idx][d] != null)
            return dp[idx][d];

        int max = 0;
        int res = Integer.MAX_VALUE;

        for (int i = idx; i < size; ++i) {
            max = Math.max(arr[i], max);
            res = Math.min(res, max + helper(i + 1, arr, d - 1));
        }

        return dp[idx][d] = res;
    }
}
