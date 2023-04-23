package day_270;

/**
 * <a href = "https://leetcode.com/problems/restore-the-array/" >
 * 1416. Restore The Array </a>
 * <p>
 * A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits s and all we know is that all integers in the array were in the range [1, k] and there are no leading zeros in the array.
 * <p>
 * Given the string s and the integer k, return the number of the possible arrays that can be printed as s using the mentioned program. Since the answer may be very large, return it modulo 109 + 7.
 */

public class RestoreTheArray {
    int mod = (int) 1e9 + 7;

    public int numberOfArrays(String s, int k) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            long num = 0, sum = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (num == 0 || num > k)
                    break;
                sum += dp[j + 1];
            }
            dp[i] = (int) (sum % mod);
        }
        return dp[0];
    }

}
