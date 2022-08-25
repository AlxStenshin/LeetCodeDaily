package day_029;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * https://leetcode.com/problems/ransom-note/
 *
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
 * from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> resultFreq = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            resultFreq.put(c, resultFreq.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            resultFreq.put(c, resultFreq.getOrDefault(c, -1) - 1);
        }

        for (Map.Entry<Character, Integer> e : resultFreq.entrySet()) {
            if (e.getValue() < 0)
                return false;
        }
        return true;
    }
}
