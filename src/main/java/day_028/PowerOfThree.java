package day_028;

/**
 * 326. Power of Three
 * https://leetcode.com/problems/power-of-three/
 *
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 *
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 */

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 0)
            return false;
        double a = ((Math.log(n) / Math.log(3)));
        return Math.abs(a - Math.round(a)) < 1e-10;
    }
}
