package day_122;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumProfitInJobScheduling {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobs = new Job[startTime.length];

        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        return schedule(jobs);
    }

    private int schedule(Job[] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(a -> a.end));
        int n = jobs.length;
        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for (int i = 1; i <= n - 1; i++) {
            int profit = jobs[i].profit;
            int l = binarySearch(jobs, i);
            if (l != -1)
                profit += dp[l];
            dp[i] = Math.max(profit, dp[i - 1]);
        }
        return dp[n - 1];
    }

    private int binarySearch(Job[] jobs, int index) {
        int st = 0, end = index - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (jobs[mid].end <= jobs[index].start) {
                if (jobs[mid + 1].end > jobs[index].start) {
                    return mid;
                } else {
                    st = mid + 1;
                }
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
}