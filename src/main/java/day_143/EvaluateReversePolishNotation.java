package day_143;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 * 150. Evaluate Reverse Polish Notation </a>
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * <p>
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 */

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> stack.push((int) (1D / stack.pop() * stack.pop()));
                default -> stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
