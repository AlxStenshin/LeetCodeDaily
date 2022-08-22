package day_026;

/**
 * 342. Power of Four
 * https://leetcode.com/problems/power-of-four/
 *
 * Given an integer n, return true if it is a power of four.
 * Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 */

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n < 0)
            return false;
        return ((Math.log(n) / Math.log(4)) % 1) == 0;
    }
}