package day_057;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href=https://leetcode.com/problems/reverse-words-in-a-string-iii/">
 *    557. Reverse Words in a String III</a>
 * <p>
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */

public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
