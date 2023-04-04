package day_251;

import java.util.HashSet;

/**
 * <a href = "https://leetcode.com/problems/optimal-partition-of-string/">
 * 2405. Optimal Partition of String </a>
 * <p>
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
 * <p>
 * Return the minimum number of substrings in such a partition.
 * <p>
 * Note that each character should belong to exactly one substring in a partition.
 */

public class OptimalPartitionOfString {

    public int partitionString_Hash(String s) {
        int answer = 1;
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                answer++;
                charSet.clear();
            }
            charSet.add(c);
        }
        return answer;
    }

    public int partitionString(String s) {
        int result = 1;
        char[] charFreq = new char[26];

        for (int i = 0; i < s.length(); i++) {
            if (charFreq[s.charAt(i) - 'a'] != 0) {
                result++;
                charFreq = new char[26];
            }
            charFreq[s.charAt(i) - 'a']++;
        }
        return result;
    }

}
