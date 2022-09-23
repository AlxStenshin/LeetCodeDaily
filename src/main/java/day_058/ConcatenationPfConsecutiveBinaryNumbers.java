package day_058;

/**
 * <a href=https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/">
 *    1680. Concatenation of Consecutive Binary Numbers</a>
 * <p>
 * Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 109 + 7.
 */

public class ConcatenationPfConsecutiveBinaryNumbers {
    public int concatenatedBinary(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result = (result * (int) Math.pow(2, Integer.toBinaryString(i).length()) + i) % 1000000007;
        }
        return (int) result;
    }
}
