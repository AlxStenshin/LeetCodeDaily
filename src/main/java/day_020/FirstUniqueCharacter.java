package day_020;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 */

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        Map<Character, Integer> dictionary = new LinkedHashMap<>();
        for (Character c : s.toCharArray()) {
            dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
        }

        return dictionary.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .map(s::indexOf)
                .orElse(-1);
    }
}
