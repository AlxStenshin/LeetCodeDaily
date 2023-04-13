package day_260;

import java.util.Stack;

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
