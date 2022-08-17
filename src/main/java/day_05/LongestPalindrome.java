package day_05;

import java.util.HashSet;
import java.util.Set;

/**
 * 409. Longest Palindrome
 * https://leetcode.com/problems/longest-palindrome/
 *
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int pairsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
                pairsCount++;
            } else {
                set.add(c);
            }
        }
        if (!set.isEmpty()) {
            return pairsCount * 2 + 1;
        }
        return pairsCount * 2;
    }
}
