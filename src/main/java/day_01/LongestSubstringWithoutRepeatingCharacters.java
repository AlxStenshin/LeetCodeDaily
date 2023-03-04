package day_01;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstringOptimized(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        while (endIndex < s.length()) {
            if (!set.contains(s.charAt(endIndex))) {
                set.add(s.charAt(endIndex));
                maxLen = Math.max(maxLen, set.size());
                endIndex++;
            } else {
                set.remove(s.charAt(startIndex));
                startIndex++;
            }
        }

        return maxLen;
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (maxLen >= s.length() - i)
                break;
            maxLen = Math.max(maxLen, getMaxLen(s.substring(i)));
        }

        return maxLen;
    }

    private int getMaxLen(String substring) {
        Set<Character> charSet = new HashSet<>();
        for (char c : substring.toCharArray()) {
            if (!charSet.add(c))
                return charSet.size();
        }
        return charSet.size();
    }
}
