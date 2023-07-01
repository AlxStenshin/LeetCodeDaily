package day_339;

/**
 * <a href = "https://leetcode.com/problems/fair-distribution-of-cookies/" >
 * 2305. Fair Distribution of Cookies </a>
 * <p>
 * You are given an integer array cookies, where cookies[i] denotes the number of cookies in the ith bag. You are also given an integer k that denotes the number of children to distribute all the bags of cookies to. All the cookies in the same bag must go to the same child and cannot be split up.
 * <p>
 * The unfairness of a distribution is defined as the maximum total cookies obtained by a single child in the distribution.
 * <p>
 * Return the minimum unfairness of all distributions.
 */

public class FairDistributionOfCookies {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, k, new int[k]);
        return ans;
    }

    void helper(int[] cookies, int start, int k, int[] temp) {
        if (start == cookies.length) {
            int max = 0;
            for (int c : temp)
                max = Math.max(max, c);
            ans = Math.min(ans, max);
            return;
        }

        for (int i = 0; i < k; i++) {
            temp[i] += cookies[start];
            helper(cookies, start + 1, k, temp);
            temp[i] -= cookies[start];
        }
    }
}
