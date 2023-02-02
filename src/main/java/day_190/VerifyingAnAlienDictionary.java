package day_190;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/verifying-an-alien-dictionary/">
 * 953. Verifying an Alien Dictionary </a>
 * <p>
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.
 */

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {

        Map<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < order.length(); i++)
            dict.put(order.charAt(i), i);

        for (int i = 1; i < words.length; i++) {
            String curr = words[i];
            String prev = words[i - 1];

            for (int j = 0; j < prev.length(); j++) {
                if (j == curr.length())
                    return false;

                char prevChar = prev.charAt(j);
                char currChar = curr.charAt(j);

                if (dict.get(prevChar) < dict.get(currChar))
                    break;

                if (dict.get(prevChar) > dict.get(currChar))
                    return false;
            }
        }
        return true;
    }
}
