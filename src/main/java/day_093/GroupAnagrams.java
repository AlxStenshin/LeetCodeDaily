package day_093;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/group-anagrams/">
 * 49. Group Anagrams </a>
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagramsArrays(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] anagramAsArray = new char[26];
            for (char c : s.toCharArray())
                anagramAsArray[c - 'a']++;

            String anagramAsStringFromArray = String.valueOf(anagramAsArray);
            if (!map.containsKey(anagramAsStringFromArray))
                map.put(anagramAsStringFromArray, new ArrayList<>());
            map.get(anagramAsStringFromArray).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsHashMaps(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> results = new HashMap<>();

        for (String s : strs) {
            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (Character c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            if (results.containsKey(freqMap)) {
                List<String> anagrams = results.get(freqMap);
                anagrams.add(s);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                results.put(freqMap, list);
            }
        }

        return new ArrayList<>(results.values());
    }
}
