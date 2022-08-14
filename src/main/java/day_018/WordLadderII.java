package day_018;

import java.util.*;

/**
 * 126. Word Ladder II
 * https://leetcode.com/problems/word-ladder-ii/
 *
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence
 * of words beginWord -> s1 -> s2 -> ... -> sk such that:
 *
 * Every adjacent pair of words differs by a single letter.
 * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * sk == endWord
 * Given two words, beginWord and endWord, and a dictionary wordList, return all the shortest transformation
 * sequences from beginWord to endWord, or an empty list if no such sequence exists.
 * Each sequence should be returned as a list of the words [beginWord, s1, s2, ..., sk].
 */

public class WordLadderII {
    Set<String> set = new HashSet<>();
    String beginWord, endWord;
    Map<String, Integer> dist = new HashMap<>();
    List<List<String>> res;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        this.beginWord = beginWord;
        this.endWord = endWord;
        this.res = new ArrayList<>();
        set.addAll(wordList);
        short_path();
        if (dist.get(endWord) == null)
            return res;
        List<String> path = new ArrayList<>();
        path.add(endWord);
        dfs(endWord, path);
        return res;
    }

    private void short_path() {
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        dist.put(beginWord, 0);
        while(q.size() > 0) {
            String cur = q.poll();
            if (cur.equals(endWord) ) break;
            char[] charCur = cur.toCharArray();
            for (int i = 0; i < cur.length(); i++) {
                char c = charCur[i];
                for (char j = 'a'; j <= 'z'; j++) {
                    charCur[i] = j;
                    String s = new String(charCur);
                    if (set.contains(s) && dist.get(s) == null) {
                        dist.put(s, dist.get(cur) + 1);
                        q.offer(s);
                    }
                }
                charCur[i] = c;
            }
        }
    }

    private void dfs(String word, List<String> path) {
        if (word.equals(beginWord)) {
            List<String> list = new ArrayList<>(path);
            Collections.reverse(list);
            res.add(list);
            return;
        }

        char[] charCur = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            char c = charCur[i];
            for (char j = 'a'; j <= 'z'; j++) {
                charCur[i] = j;
                String s = new String(charCur);
                if (dist.get(s) != null && dist.get(s) + 1 == dist.get(word)) {
                    path.add(s);
                    dfs(s, path);
                    path.remove(path.size() - 1);
                }
            }
            charCur[i] = c;
        }
    }
}
