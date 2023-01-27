package day_184;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/concatenated-words/">
 * 472. Concatenated Words </a>
 * <p>
 * Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
 * <p>
 * A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.
 */

public class ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        final Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        final List<String> answer = new ArrayList<>();
        for (final String word : words) {
            final int length = word.length();
            final boolean[] visited = new boolean[length];
            if (dfs(word, 0, visited, dictionary)) {
                answer.add(word);
            }
        }
        return answer;
    }

    private boolean dfs(final String word, int length, final boolean[] visited, final Set<String> dictionary) {
        if (length == word.length()) {
            return true;
        }

        if (visited[length]) {
            return false;
        }

        visited[length] = true;
        for (int i = word.length() - (length == 0 ? 1 : 0); i > length; --i) {
            if (dictionary.contains(word.substring(length, i)) && dfs(word, i, visited, dictionary)) {
                return true;
            }
        }
        return false;
    }

}
