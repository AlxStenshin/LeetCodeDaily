package day_003;

import java.util.*;

/**
 * 916. Word Subsets
 * https://leetcode.com/problems/word-subsets/
 * You are given two string arrays words1 and words2.
 *
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 *
 * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 * A string a from words1 is universal if for every string b in words2, b is a subset of a.
 *
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 *
 * Solution:
 * 1. Make master list of all unique characters in words2:
 * 2. Do the same for each word in words1 -> target set: (Map<String, List<Character>)
 * 3. Check all unique (master) chars are in the target set
 */

public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new LinkedList<>();
        for (String s : words1) {
            if (containsAll(s, words2))
                result.add(s);
        }
        return result;
    }

    private boolean containsAll(String target, String[] master) {
        var targetFreq = buildFrequencyStats(target);

        for (String l : master) {
            var masterFreq = buildFrequencyStats(l);

            for (Map.Entry<Character, Integer> e : masterFreq.entrySet()) {
                if (!targetFreq.containsKey(e.getKey()))
                    return false;
                if (targetFreq.get(e.getKey()) < e.getValue())
                    return false;
            }
        }
        return true;
    }

    private HashMap<Character, Integer> buildFrequencyStats(String target) {
        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (Character c : target.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        return targetFreq;
    }
}
