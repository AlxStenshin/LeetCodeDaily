package day_273;

/**
 * <a href = "https://leetcode.com/problems/add-digits/" >
 * 258. Add Digits</a>
 * <p>
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class AddDigits {
    public int addDigits(int num) {
        return num <= 9 ? num : addDigits(num % 10 + addDigits(num / 10));
    }
}
