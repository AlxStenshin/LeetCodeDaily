package day_002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 890. Find and Replace Pattern
 * https://leetcode.com/problems/find-and-replace-pattern/
 *
 * Given a list of strings words and a string pattern, return a list of words[i] that match pattern.
 * You may return the answer in any order.
 *
 * A word matches the pattern if there exists a permutation of letters p so that after replacing
 * every letter x in the pattern with p(x), we get the desired word.
 *
 * Recall that a permutation of letters is a bijection from letters to letters:
 * every letter maps to another letter, and no two letters map to the same letter.
 */

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        return Arrays.stream(words).filter(s -> matches(s, pattern)).collect(Collectors.toList());
    }

    boolean matches(String word, String pattern) {
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i)))
                return false;
        }
        return true;
    }

    private boolean matchesBasedOnMap(String word, String pattern) {
        if (word.length() != pattern.length())
            return false;

        HashMap<Character, Character> set = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (set.getOrDefault(w, p) != p)
                return false;
            else set.put(w, p);
        }
        return true;
    }

}
