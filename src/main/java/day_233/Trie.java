package day_233;

/**
 * <a href = "https://leetcode.com/problems/implement-trie-prefix-tree/">
 * 208. Implement Trie (Prefix Tree) </a>
 * <p>
 *A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
 * <p>
 * Implement the Trie class:
 * <p>
 * Trie() Initializes the trie object.<br>
 * void insert(String word) Inserts the string word into the trie.<br>
 * boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.<br>
 * boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.<br>
 */

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isCompleteWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isCompleteWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    static class TrieNode {
        boolean isCompleteWord;
        TrieNode[] children;

        public TrieNode() {
            isCompleteWord = false;
            children = new TrieNode[26];
        }
    }

}
