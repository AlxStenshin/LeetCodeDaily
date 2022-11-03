package day_099;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/">
 * 2131. Longest Palindrome by Concatenating Two Letter Words </a>
 * <p>
 * You are given an array of strings words. Each element of words consists of two lowercase English letters.
 * <p>
 * Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.
 * <p>
 * Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.
 * <p>
 * A palindrome is a string that reads the same forward and backward.
 */

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {

        HashMap<String, Integer> wordsFreqMap = new HashMap<>();
        for (var s : words) {
            wordsFreqMap.put(s, wordsFreqMap.getOrDefault(s, 0) + 1);
        }

        int answer = 0;
        boolean containsCenterElement = false;

        for (var entry : wordsFreqMap.entrySet()) {
            String word = entry.getKey();
            int currentWordCount = entry.getValue();

            if (isMirror(word)) {
                if (currentWordCount % 2 == 0) {
                    answer += currentWordCount;
                } else {
                    answer += currentWordCount - 1;
                    containsCenterElement = true;
                }
            } else if (word.charAt(0) < word.charAt(1)) {
                String reversedWord = reverseString(word);
                if (wordsFreqMap.containsKey(reverseString(word))) {
                    answer += 2 * Math.min(currentWordCount, wordsFreqMap.get(reversedWord));
                }
            }
        }

        if (containsCenterElement) {
            answer++;
        }

        return 2 * answer;
    }

    private String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private boolean isMirror(String input) {
        return input.charAt(0) == input.charAt(1);
    }
}
