package day_179;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/palindrome-partitioning/">
 * 131. Palindrome Partitioning </a>
 * <p>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 */

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        palindromePartition(0, new ArrayList<>(), result, s);
        return result;
    }

    public void palindromePartition(int index, List<String> ds, List<List<String>> result, String input) {
        if (index == input.length()) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < input.length(); i++) {
            if (checkPalindrome(input, index, i)) {
                ds.add(input.substring(index, i + 1));
                palindromePartition(i + 1, ds, result, input);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public boolean checkPalindrome(String str, int startIndex, int lastIndex) {
        while (startIndex <= lastIndex) {
            if (str.charAt(startIndex) != str.charAt(lastIndex))
                return false;
            startIndex++;
            lastIndex--;
        }
        return true;
    }

}
