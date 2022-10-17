package day_082;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">
 *  1832. Check if the Sentence Is Pangram</a>
 * <p>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (Character c : sentence.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap.size() >= 26;
    }
}
