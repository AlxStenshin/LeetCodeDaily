package day_106;

/**
 * <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">
 *  1047. Remove All Adjacent Duplicates In String </a>
 * <p>
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 * <p>
 * We repeatedly make duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 */

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicatesStringBuilder(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String removeDuplicatesTwoPointers(String s) {
        char[] a = s.toCharArray();
        int endIndex = -1;
        for (char c : a) {
            if (endIndex >= 0 && a[endIndex] == c) {
                --endIndex;
            } else {
                a[++endIndex] = c;
            }
        }
        return String.valueOf(a, 0, endIndex + 1);
    }

    public String removeDuplicates(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                return removeDuplicates(s.substring(0, i) + s.substring(i + 2));
        }
        return s;
    }
}
