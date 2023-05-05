package day_282;

/**
 * <a href = "https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/" >
 * 1456. Maximum Number of Vowels in a Substring of Given Length </a>
 * <p>
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 */

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        for (var i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;
            if (i >= k && isVowel(s.charAt(i - k))) count--;

            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels_slow(String s, int k) {
        int maxVowelCount = Integer.MIN_VALUE;
        int currentStartIndex = 0;
        while (currentStartIndex+k <= s.length()) {
            maxVowelCount = Math.max(maxVowelCount,
                    calculateVowelCount(s.substring(currentStartIndex, currentStartIndex + k)));
            currentStartIndex++;
        }

        return maxVowelCount;
    }

    private int calculateVowelCount(String substring) {
        System.out.println(substring);
        int count = 0;
        for (var c : substring.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }
}
