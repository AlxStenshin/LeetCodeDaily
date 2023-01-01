package day_158;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/word-pattern/">
 * 290. Word Pattern </a>
 * <p>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] patternList = pattern.toCharArray();
        String[] stringList = s.split(" ");

        if (patternList.length != stringList.length)
            return false;

        int size = patternList.length;

        Map<Character, String> patternMatchMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            Character key = patternList[i];
            String value = stringList[i];

            if (patternMatchMap.containsValue(value) && (!value.equals(patternMatchMap.get(key))) ||
                    patternMatchMap.containsKey(key) && (!value.equals(patternMatchMap.get(key))))
                return false;
            patternMatchMap.put(key, value);
        }
        return true;
    }
}
