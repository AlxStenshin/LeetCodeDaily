package day_174;

/**
 * <a href = "https://leetcode.com/problems/flip-string-to-monotone-increasing/">
 * 926. Flip String to Monotone Increasing </a>
 * <p>
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).
 * <p>
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 * <p>
 * Return the minimum number of flips to make s monotone increasing.
 */

public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int result = 0;
        int flipCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                result = Math.min(flipCount, result + 1);
            else
                flipCount++;
        }

        return result;
    }

}
