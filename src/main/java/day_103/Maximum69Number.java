package day_103;

/**
 * <a href="https://leetcode.com/problems/maximum-69-number/">
 *  1323. Maximum 69 Number </a>
 * <p>
 * You are given a positive integer num consisting only of digits 6 and 9.
 * <p>
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

public class Maximum69Number {
    public int maximum69Number (int num) {
        char[] number = Integer.toString(num).toCharArray();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == '6') {
                number[i] = '9';
                return Integer.parseInt(new String(number));
            }
        }
        return num;
    }
}
