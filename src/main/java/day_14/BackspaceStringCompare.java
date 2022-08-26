package day_14;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 * https://leetcode.com/problems/backspace-string-compare/
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = fillStack(s);
        Stack<Character> tStack = fillStack(t);

        return stringFromStack(sStack).equals(stringFromStack(tStack));
    }

    Stack<Character> fillStack(String input) {
        Stack<Character> backspaced = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '#') {
                if (!backspaced.isEmpty())
                    backspaced.pop();
            }
            else
                backspaced.push(c);
        }
        return backspaced;
    }

    String stringFromStack(Stack<Character> input) {
        StringBuilder str = new StringBuilder();
        while (!input.isEmpty()) {
            str.append(input.pop());
        }
        return str.toString();
    }

}
