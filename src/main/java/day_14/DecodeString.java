package day_14;

import java.util.Stack;

/**
 * 394. Decode String
 * https://leetcode.com/problems/decode-string/
 *
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid;
 * there are no extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that digits
 * are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 */

public class DecodeString {
    public String decodeString(String s) {

        Stack<String> prefixes = new Stack<>();
        Stack<Integer> numbers = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int number = 0;

                while (Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }

                numbers.push(number);
                prefixes.push(sb.toString());
                sb.setLength(0);

            } else if (c == ']') {
                String inner = sb.toString();
                sb.setLength(0);
                sb.append(prefixes.pop());
                int number = numbers.pop();
                sb.append(inner.repeat(Math.max(0, number)));

            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
