package day_101;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/word-search-ii/">
 * 212. Word Search II </a>
 * <p>
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * <p>
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 */

public class WordSearchTwo {

    List<String> result;
    char[][] board;

    public List<String> findWordsTrie(char[][] board, String[] words) {
        result = new ArrayList<>();
        this.board = board;
        TrieNode trie = new TrieNode();
        trie.constructTrie(words);
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                helper(r, c, trie);
            }
        }
        return result;
    }

    private void helper(int r, int c,TrieNode trie) {
        if (r < 0 || c < 0 || r == board.length || c == board[r].length || board[r][c] == '#') return;
        char currentChar = board[r][c];
        TrieNode next = trie.children[currentChar - 'a'];
        if (next == null) return;
        if (!next.word.equals("")) {
            result.add(next.word);
            next.word = "";
        }
        board[r][c] = '#';
        helper(r + 1, c, next);
        helper(r - 1, c, next);
        helper(r, c + 1, next);
        helper(r, c - 1, next);
        board[r][c] = currentChar;
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode['z' - 'a' + 1];
        String word = "";

        public void constructTrie(String[] words) {
            TrieNode current = this;
            for (String word : words) {
                for (char c : word.toCharArray()) {
                    if (current.children[c - 'a'] == null) {
                        current.children[c - 'a'] = new TrieNode();
                    }
                    current = current.children[c - 'a'];
                }
                current.word = word;
                current = this;
            }
        }
    }

    // Slower solution using dfs
    boolean[][] v;
    int cols, rows;

    public List<String> findWords(char[][] board, String[] words) {
        cols = board.length;
        rows = board[0].length;

        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            v = new boolean[cols][rows];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    if (word.charAt(0) == board[i][j] && dfs(i, j, board, 0, word) && !set.contains(word)) {
                        result.add(word);
                        set.add(word);
                    }
                }
            }
        }
        return result;
    }

    public boolean dfs(int i, int j, char[][] board, int at, String word) {
        if (at == word.length()) return true;
        if (i >= cols || i < 0 || j >= rows || j < 0 ||
                v[i][j] || board[i][j] != word.charAt(at)) return false;

        v[i][j] = true;

        if (
                dfs(i + 1, j, board, at + 1, word) ||
                        dfs(i - 1, j, board, at + 1, word) ||
                        dfs(i, j + 1, board, at + 1, word) ||
                        dfs(i, j - 1, board, at + 1, word))
            return true;

        v[i][j] = false;

        return false;
    }
}
