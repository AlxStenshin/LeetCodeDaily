package day_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. Find All Anagrams in a String
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 *
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length())
            return new ArrayList<>();

        Map<Character, Integer> patternFreqMap = buildFreqMap(p, p.length());
        Map<Character, Integer> sourceFreqMap = buildFreqMap(s, p.length());
        int startIndex = p.length();

        ArrayList<Integer> result = new ArrayList<>();

        while (startIndex < s.length()) {
            if (compare(sourceFreqMap, patternFreqMap)) {
                result.add(startIndex - p.length());
            }

            char arival_char = s.charAt(startIndex);
            sourceFreqMap.put(arival_char, sourceFreqMap.getOrDefault(arival_char, 0) + 1);

            char removal_char = s.charAt(startIndex - p.length());

            if (sourceFreqMap.get(removal_char) == 1)
                sourceFreqMap.remove(removal_char);
            else
                sourceFreqMap.put(removal_char, sourceFreqMap.get(removal_char) - 1);
            startIndex++;
        }

        if (compare(sourceFreqMap, patternFreqMap))
            result.add(startIndex - p.length());

        return result;
    }

    private Map<Character, Integer> buildFreqMap(String sourcce, int len) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char ch = sourcce.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        return freqMap;
    }

    boolean compare(Map<Character, Integer> source, Map<Character, Integer> pattern) {
        for (Character c : source.keySet()) {
            if (pattern.containsKey(c)) {
                if (pattern.get(c) != (int) source.get(c))
                    return false;
            } else
                return false;
        }
        return true;
    }
}
