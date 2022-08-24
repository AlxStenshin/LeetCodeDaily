package day_12;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 *
 * You are given a string s and an integer k.
 * You can choose any character of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int max_repeated = Integer.MIN_VALUE;
        int max_length = Integer.MIN_VALUE;
        Map<Character, Integer> charFreq = new HashMap<>();

        while (right < s.length()) {
            charFreq.put(s.charAt(right), charFreq.getOrDefault(s.charAt(right), 0) + 1);
            max_repeated = Math.max(max_repeated, charFreq.get(s.charAt(right)));
            if (right - left + 1 - max_repeated > k) {
                charFreq.put(s.charAt(left), charFreq.get(s.charAt(left)) - 1);
                left++;
            }
            max_length = Math.max(max_length, right - left + 1);
            right++;
        }
        return max_length;
    }
}
