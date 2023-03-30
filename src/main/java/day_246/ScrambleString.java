package day_246;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">
 * 87. Scramble String </a>
 * <p>
 * We can scramble a string s to get a string t using the following algorithm:
 * <p>
 * If the length of the string is 1, stop.<br>
 * If the length of the string is > 1, do the following:<br>
 * Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y where s = x + y.<br>
 * Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become s = x + y or s = y + x.<br>
 * Apply step 1 recursively on each of the two substrings x and y.<br>
 * Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false.<br>
 */

public class ScrambleString {
    Map<String, Boolean> map = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        if (s1.equals(s2)) {
            return true;
        }

        int[] a = new int[26];
        int[] b = new int[26];
        int[] c = new int[26];

        if (map.containsKey(s1 + s2)) {
            return map.get(s1 + s2);
        }

        for (int i = 1; i <= n - 1; i++) {
            int j = n - i;
            a[s1.charAt(i - 1) - 'a']++;
            b[s2.charAt(i - 1) - 'a']++;
            c[s2.charAt(j) - 'a']++;

            if (Arrays.equals(a, b) &&
                    isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                    isScramble(s1.substring(i), s2.substring(i))) {
                map.put(s1 + s2, true);
                return true;
            }

            if (Arrays.equals(a, c) &&
                    isScramble(s1.substring(0, i), s2.substring(j)) &&
                    isScramble(s1.substring(i), s2.substring(0, j))) {
                map.put(s1 + s2, true);
                return true;

            }
        }

        map.put(s1 + s2, false);
        return false;

    }
}
