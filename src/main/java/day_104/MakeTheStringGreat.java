package day_104;

/**
 * <a href="https://leetcode.com/problems/make-the-string-great/">
 *  1544. Make The String Great </a>
 * <p>
 * Given a string s of lower and upper case English letters.
 * <p>
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 * <p>
 * 0 <= i <= s.length - 2
 * <p>
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * <p>
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 * <p>
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * <p>
 * Notice that an empty string is also good.
 */

public class MakeTheStringGreat {
    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32)
                return makeGood(s.substring(0, i) + s.substring(i + 2));
        }
        return s;
    }
}