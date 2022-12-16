package day_142;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/implement-queue-using-stacks/description/">
 *  232. Implement Queue using Stacks </a>
 * <p>
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.<br>
 * int pop() Removes the element from the front of the queue and returns it.<br>
 * int peek() Returns the element at the front of the queue.<br>
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * <p>
 * Notes:<br>
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.<br>
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */

class MyQueue {

    private int frontElement;
    private final Stack<Integer> stack;
    private final Stack<Integer> reversedStack;

    public MyQueue() {
        this.stack = new Stack<>();
        this.reversedStack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty())
            frontElement = x;

        while (!stack.isEmpty())
            reversedStack.push(stack.pop());

        reversedStack.push(x);

        while (!reversedStack.empty())
            stack.push(reversedStack.pop());
    }

    public int pop() {
        int result = stack.pop();
        if (!stack.isEmpty())
            frontElement = stack.peek();
        return result;
    }

    public int peek() {
        return frontElement;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
