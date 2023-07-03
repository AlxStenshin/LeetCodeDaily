package day_341;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/buddy-strings/" >
 * 859.Buddy Strings </a>
 * <p>
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
 * <p>
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
 * <p>
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 */

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        int diff1 = -1, diff2 = -1;
        Set<Character> A_letters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diff1 == -1)
                    diff1 = i;
                else if (diff2 == -1)
                    diff2 = i;
                else
                    return false;
            }
            A_letters.add(s.charAt(i));
        }

        if (diff1 != -1 && diff2 != -1)
            return s.charAt(diff1) == goal.charAt(diff2) && s.charAt(diff2) == goal.charAt(diff1);
        if (diff1 != -1)
            return false;
        return A_letters.size() < s.length();
    }
}
