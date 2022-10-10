package day_075;

/**
 * <a href="https://leetcode.com/problems/break-a-palindrome/">
 *   1328. Break a Palindrome</a>
 * <p>
 * Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase
 * English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.
 * <p>
 * Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
 * <p>
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ,
 * a has a character strictly smaller than the corresponding character in b.
 * For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, and 'c' is smaller than 'd'.
 */

public class BreakPalindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1)
            return "";

        char[] pal = palindrome.toCharArray();
        int size = pal.length;

        for (int i = 0; i < size/2; i++) {
            if (pal[i] != 'a') {
                pal[i] = 'a';
                return  String.valueOf(pal);
            }
        }
        pal[size-1] = 'b';
        return String.valueOf(pal);
    }
}
