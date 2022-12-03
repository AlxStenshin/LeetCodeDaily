package day_116;

import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/basic-calculator/">
 * 224. Basic Calculator </a>
 * <p>
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
 * <p>
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 */

public class BasicCalculator {
    public int calculate(String s) {
        int len = s.length();
        int sign = 1;
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {

            // digit: it should be one digit from the current number and consecutive digits forms sum
            if (Character.isDigit(s.charAt(i))) {
                int localSum = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    localSum = localSum * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                result += localSum * sign;

                // '+' : set the sign to 1;
            } else if (s.charAt(i) == '+')
                sign = 1;

                // '-' : set the sign to -1
            else if (s.charAt(i) == '-')
                sign = -1;

                // '(' : push the previous result and the sign into the stack, set result to 0, just calculate
                //       the new result within the parenthesis.
            else if (s.charAt(i) == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;

                // ')' : pop out the top two numbers from stack, first one is the sign before this pair of parenthesis,
                //       second is the temporary result before this pair of parenthesis. We add them together.
            } else if (s.charAt(i) == ')') {
                result = result * stack.pop() + stack.pop();
            }
        }
        return result;
    }
}
