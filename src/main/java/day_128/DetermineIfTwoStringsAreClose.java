package day_128;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
