package day_233;

import java.util.HashSet;
import java.util.Set;

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

public class Trie_Brute {

    Set<String> container = new HashSet<>();

    public Trie_Brute() {

    }

    public void insert(String word) {
        container.add(word);
    }

    public boolean search(String word) {
        return container.stream().anyMatch(s -> s.equals(word));
    }

    public boolean startsWith(String prefix) {
        return container.stream().anyMatch(s -> s.startsWith(prefix));
    }
}
