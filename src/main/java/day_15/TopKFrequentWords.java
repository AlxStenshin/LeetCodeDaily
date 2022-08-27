package day_15;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 692. Top K Frequent Words
 * https://leetcode.com/problems/top-k-frequent-words/
 *
 * Given an array of strings words and an integer k, return the k most frequent strings.
 *
 * Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 */

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> wordFreqMap = new HashMap<>();
        for (String s : words)
            wordFreqMap.put(s, wordFreqMap.getOrDefault(s, 0) + 1);

        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        maxHeap.addAll(wordFreqMap.entrySet());
        List<String> list = new ArrayList<>();

        while (k-- > 0) {
            Map.Entry<String, Integer> e = maxHeap.poll();
            list.add(e.getKey());
        }
        return list;
    }
}
