package day_102;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/orderly-queue/">
 * 899. Orderly Queue </a>
 * <p>
 * You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string..
 * <p>
 * Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
 */

public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String ans = s;
            for (int i = 0; i < s.length(); ++i) {
                String temp = s.substring(i) + s.substring(0, i);
                if (temp.compareTo(ans) < 0) {
                    ans = temp;
                }
            }
            return ans;
        } else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
