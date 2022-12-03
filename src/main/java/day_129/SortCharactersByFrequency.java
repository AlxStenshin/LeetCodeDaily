package day_129;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/sort-characters-by-frequency/">
 * 451. Sort Characters By Frequency </a>
 * <p>
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
 * <p>
 * Return the sorted string. If there are multiple answers, return any of them.
 */

public class SortCharactersByFrequency {

    public String frequencySortPriorityQueue(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (var c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a));
        for (char c : freqMap.keySet()) {
            pq.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            sb.append(String.valueOf(c).repeat(Math.max(0, freqMap.get(c))));
        }
        return sb.toString();
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (var c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> result = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        StringBuilder resultString = new StringBuilder();
        for (var e : result) {
            resultString.append(String.valueOf(e.getKey()).repeat(Math.max(0, e.getValue())));
        }
        return resultString.toString();
    }

}
