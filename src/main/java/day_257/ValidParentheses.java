package day_257;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 * 20. Valid Parentheses </a>
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            switch (c) {
                case '(', '{', '[' -> stack.push(c);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }

                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }

                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }

        return stack.isEmpty();
    }
}
