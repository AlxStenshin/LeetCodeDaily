package day_128;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/determine-if-two-strings-are-close/">
 * 1657. Determine if Two Strings Are Close </a>
 * <p>
 * Two strings are considered close if you can attain one from the other using the following operations:
 * <p>
 * Operation 1: Swap any two existing characters.<br>
 * For example, abcde -> aecdb
 * <p>
 * Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.<br>
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * <p>
 * You can use the operations on either string as many times as necessary.<br>
 * <p>
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        var firstFreq = getFreqMap(word1);
        var secondFreq = getFreqMap(word2);

        // Words should contain same elements
        if (!firstFreq.entrySet().stream()
                .allMatch(e -> secondFreq.containsKey(e.getKey())))
            return false;

        // Character frequencies should match
        List<Integer> firstValues = firstFreq.values().stream().sorted().collect(Collectors.toList());
        List<Integer> secondValues = secondFreq.values().stream().sorted().collect(Collectors.toList());
        return firstValues.equals(secondValues);
    }

    private HashMap<Character, Integer> getFreqMap(String input) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (Character c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}
