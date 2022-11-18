package day_114;

/**
 * <a href = "https://leetcode.com/problems/ugly-number/">
 * 263. Ugly Number </a>
 * <p>
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return true if n is an ugly number.
 */

public class UglyNumber {

    public boolean isUglyRecursion(int n) {
        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 == 0) {
            return isUgly(n / 2);
        }

        if (n % 3 == 0) {
            return isUgly(n / 3);
        }

        if (n % 5 == 0) {
            return isUgly(n / 5);
        }

        return false;
    }

    public boolean isUgly(int n) {

        if (n < 1) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
