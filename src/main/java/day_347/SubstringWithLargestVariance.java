package day_347;

import java.util.HashSet;

/**
 * <a href = "https://leetcode.com/problems/substring-with-largest-variance/" >
 * 2272. Substring With Largest Variance </a>
 * <p>
 * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters present in the string. Note the two characters may or may not be the same.
 * <p>
 * Given a string s consisting of lowercase English letters only, return the largest variance possible among all substrings of s.
 * <p>
 * A substring is a contiguous sequence of characters within a string.
 */

public class SubstringWithLargestVariance {
    public int largestVariance(String s) {
        int count1, count2;
        int maxVariance = 0;

        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            distinctChars.add(c);
        }

        for (int runs = 0; runs < 2; runs++) {
            for (char l1 : distinctChars) {
                for (char l2 : distinctChars) {
                    if (l1 == l2) {
                        continue;
                    }
                    count1 = count2 = 0;
                    for (char letter : s.toCharArray()) {
                        if (letter == l1) {
                            count1++;
                        } else if (letter == l2) {
                            count2++;
                        }
                        if (count1 < count2) {
                            count1 = count2 = 0;
                        } else if (count1 > 0 && count2 > 0) {
                            maxVariance = Math.max(maxVariance, count1 - count2);
                        }
                    }
                }
            }
            s = new StringBuilder(s).reverse().toString();
        }

        return maxVariance;
    }
}
