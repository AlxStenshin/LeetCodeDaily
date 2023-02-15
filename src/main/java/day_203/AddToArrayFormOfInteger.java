package day_203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/add-to-array-form-of-integer/" >
 * 989. Add to Array-Form of Integer </a>
 * <p>
 * The array-form of an integer num is an array representing its digits in left to right order.
 * <p>
 * For example, for num = 1321, the array form is [1,3,2,1].
 * <p>
 * Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
 */

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int numSize = num.length - 1;
        char[] kCharArray = String.valueOf(k).toCharArray();
        int kSize = kCharArray.length - 1;
        int inc = 0;
        int summ;
        final char zero = '0';

        List<Integer> result = new ArrayList<>(Math.max(numSize, kSize));

        while (numSize > -1 || kSize > -1 || inc != 0) {
            summ = inc;
            if (numSize > -1) summ += num[numSize--];
            if (kSize > -1) summ += kCharArray[kSize--] - zero;

            if (summ > 9) {
                inc = 1;
                summ -= 10;
            } else inc = 0;

            result.add(summ);
        }
        Collections.reverse(result);
        return result;
    }
}
