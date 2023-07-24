package day_361;

/**
 * <a href = "https://leetcode.com/problems/powx-n/" >
 * 50. Pow(x, n) </a>
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */

public class PowX {
    public double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double pow = 1;

        while (n != 0) {
            if ((n & 1) != 0) {
                pow *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return pow;
    }
}
