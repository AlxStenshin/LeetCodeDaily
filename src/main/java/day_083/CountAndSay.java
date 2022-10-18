package day_083;

/**
 * <a href="https://leetcode.com/problems/count-and-say/">
 *  38. Count and Say</a>
 * <p>
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * <p>
 * countAndSay(1) = "1"
 * <p>
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
 * <p>
 * To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.
 * <p>
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */

public class CountAndSay {
    public String countAndSay(int n) {
        String ans = Integer.toString(1);
        for (int i = 1; i < n; i++) {
            ans = buildString(ans);
        }
        return ans;
    }

    public String buildString(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i + 1) == input.charAt(i)) {
                count++;
            } else {
                sb.append(count).append(input.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }
}
