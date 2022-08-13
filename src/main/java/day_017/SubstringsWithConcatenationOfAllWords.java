package day_017;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * 30. Substring with Concatenation of All Words
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 *
 * You are given a string s and an array of strings words of the same length.
 * Return all starting indices of substring(s) in s that is a concatenation of each word in words
 * exactly once, in any order, and without any intervening characters.
 *
 * You can return the answer in any order.
 */

public class SubstringsWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {

        if (words.length == 0) {
            return List.of();
        }

        int wordLen = words[0].length();
        int sentenceLength = wordLen * words.length;

        Map<String, Long> sourceWordsCount = Stream.of(words)
                .collect(groupingBy(word -> word, counting()));

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0, lastPossibleIndex = s.length() - sentenceLength; i <= lastPossibleIndex; i++) {
            int start = i;
            Map<String, Integer> foundWords = new HashMap<>();
            long wordsFound = IntStream.range(0, words.length)
                    .mapToObj(j -> s.substring(start + j * wordLen, start + (j + 1) * wordLen))
                    .filter(word -> sourceWordsCount.getOrDefault(word, 0L) >= foundWords.merge(word, 1, (count, unused) -> count + 1))
                    .count();
            if (wordsFound == words.length) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
