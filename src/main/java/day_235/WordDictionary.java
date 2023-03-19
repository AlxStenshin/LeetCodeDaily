package day_235;

/**
 * <a href = "https://leetcode.com/problems/design-add-and-search-words-data-structure/">
 * 211. Design Add and Search Words Data Structure </a>
 * <p>
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * <p>
 * Implement the WordDictionary class:
 * <p>
 * WordDictionary() Initializes the object.<br>
 * void addWord(word) Adds word to the data structure, it can be matched later.<br>
 * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 */

public class WordDictionary {
    private final TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = this.root;
        for (char c : word.toCharArray()) {

            if (node.doesNotContainsKey(c))
                node.put(c, new TrieNode());
            node = node.get(c);
        }
        node.isCompleted = true;
    }

    public boolean search(String word) {
        return root.search(word, 0, root);
    }

    static class TrieNode {
        private final TrieNode[] children = new TrieNode[26];
        public boolean isCompleted = false;

        public void put(char c, TrieNode node) {
            this.children[c - 'a'] = node;
        }

        public TrieNode get(char c) {
            return this.children[c - 'a'];
        }

        public boolean doesNotContainsKey(char c) {
            return this.children[c - 'a'] == null;
        }

        public boolean search(String word, int index, TrieNode node) {
            if (index == word.length())
                return node.isCompleted;
            char c = word.charAt(index);
            if (c == '.') {
                for (TrieNode child : node.children) {
                    if (child != null && child.search(word, index + 1, child))
                        return true;
                }
                return false;
            } else {
                if (node.doesNotContainsKey(c)) return false;
                return search(word, index + 1, node.get(c));
            }
        }
    }

}
