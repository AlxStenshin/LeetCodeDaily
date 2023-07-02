package day_340;

/**
 * <a href = "https://leetcode.com/problems/maximum-number-of-achievable-transfer-requests/" >
 * 1601. Maximum Number of Achievable Transfer Requests </a>
 * <p>
 * We have n buildings numbered from 0 to n - 1. Each building has a number of employees. It's transfer season, and some employees want to change the building they reside in.
 * <p>
 * You are given an array requests where requests[i] = [fromi, toi] represents an employee's request to transfer from building fromi to building toi.
 * <p>
 * All buildings are full, so a list of requests is achievable only if for each building, the net change in employee transfers is zero. This means the number of employees leaving is equal to the number of employees moving in. For example if n = 3 and two employees are leaving building 0, one is leaving building 1, and one is leaving building 2, there should be two employees moving to building 0, one employee moving to building 1, and one employee moving to building 2.
 * <p>
 * Return the maximum number of achievable requests.
 */

public class MaximumNumberOfAchievableTransferRequests {
    public int maximumRequests(int n, int[][] requests) {
        int[] reqDiff = new int[n];
        return helper(0, requests, reqDiff, n, 0);
    }

    public int helper(int start, int[][] requests, int[] reqDiff, int n, int count) {
        if (start == requests.length) {
            for (int i = 0; i < n; i++) {
                if (reqDiff[i] != 0) {
                    return 0;
                }
            }
            return count;
        }

        // Take
        reqDiff[requests[start][0]]--;
        reqDiff[requests[start][1]]++;
        int take = helper(start + 1, requests, reqDiff, n, count + 1);

        // Not-take
        reqDiff[requests[start][0]]++;
        reqDiff[requests[start][1]]--;
        int notTake = helper(start + 1, requests, reqDiff, n, count);

        return Math.max(take, notTake);
    }
}