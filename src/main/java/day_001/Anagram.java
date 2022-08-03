package day_001;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null && t == null)
            return true;
        else if (s == null)
            return false;
        else if (t == null)
            return true;
        else if (s.length() != t.length())
            return false;

        Map<Character, Integer> characters = new HashMap<>();
        for (char c : s.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int count = characters.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            characters.put(c, count - 1);
        }

        // Unused characters detection required because anagram should use all the original letters.
        return characters.entrySet().stream().anyMatch(e -> (e.getValue() == 0));
    }
}
