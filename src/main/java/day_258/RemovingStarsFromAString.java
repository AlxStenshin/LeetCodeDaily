package day_258;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 * 2390. Removing Stars From a String </a>
 * <p>
 * You are given a string s, which contains stars *.
 * <p>
 * In one operation, you can:
 * <p>
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * <p>
 * Note:
 * <p>
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 */

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!charStack.isEmpty())
                    charStack.pop();
            }
            else charStack.push(c);
        }

        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.reverse().toString();
    }
}
