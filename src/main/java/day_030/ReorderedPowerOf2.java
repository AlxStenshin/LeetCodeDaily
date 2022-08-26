package day_030;

import java.util.Arrays;

/**
 * 869. Reordered Power of 2
 * https://leetcode.com/problems/reordered-power-of-2/
 *
 * You are given an integer n.
 * We reorder the digits in any order (including the original order) such that the leading digit is not zero.
 *
 * Return true if and only if we can do this so that the resulting number is a power of two.
 */

public class ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int n) {
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);

        for (int i = 0; i < 99; i++) {
            int intCur = (int) Math.pow(2, i);
            char[] charCur = String.valueOf(intCur).toCharArray();
            Arrays.sort(charCur);
            if (Arrays.equals(num, charCur))
                return true;
        }
        return false;
    }
}
