package day_260;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/validate-stack-sequences/">
 * 946. Validate Stack Sequences </a>
 * <p>
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
 */

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int size = pushed.length;
        Stack<Integer> stack = new Stack<>();

        int poppedCount = 0;
        for (int x: pushed) {
            stack.push(x);

            while (!stack.isEmpty() &&  poppedCount < size &&
                    stack.peek() == popped[poppedCount]) {
                stack.pop();
                poppedCount++;
            }
        }

        return poppedCount == size;
    }
}
