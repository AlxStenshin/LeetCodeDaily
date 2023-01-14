package day_171;

import java.util.Set;
import java.util.TreeSet;

/**
 * <a href = "https://leetcode.com/problems/lexicographically-smallest-equivalent-string/">
 * 1061. Lexicographically Smallest Equivalent String </a>
 * <p>
 * You are given two strings of the same length s1 and s2 and a string baseStr.
 * <p>
 * We say s1[i] and s2[i] are equivalent characters.
 * <p>
 * For example, if s1 = "abc" and s2 = "cde", then we have 'a' == 'c', 'b' == 'd', and 'c' == 'e'.
 * Equivalent characters follow the usual rules of any equivalence relation:
 * <p>
 * Reflexivity: 'a' == 'a'.<br>
 * Symmetry: 'a' == 'b' implies 'b' == 'a'.<br>
 * Transitivity: 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.<br>
 * <p>
 * For example, given the equivalency information from s1 = "abc" and s2 = "cde", "acd" and "aab" are equivalent strings of baseStr = "eed", and "aab" is the lexicographically smallest equivalent string of baseStr.
 * <p>
 * Return the lexicographically smallest equivalent string of baseStr by using the equivalency information from s1 and s2.*
 */

public class LexicographicallySmallestEquivalentString {
    public String smallestEquivalentStringUnionFind(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind(26);
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            uf.connect(c1 - 'a', c2 - 'a');
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            char c = baseStr.charAt(i);
            char c2 = (char) ('a' + uf.find(c - 'a'));
            builder.append(c2);
        }
        return builder.toString();
    }

    private static class UnionFind {
        private final int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i=0; i < n; i++) parent[i] = i;
        }

        public int find(int x) {
            int y = parent[x];
            if (y != x) {
                y = find(y);
                parent[x] = y;
            }

            return y;
        }

        public void connect(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px < py) {
                parent[py] = px;
            } else if (px > py) {
                parent[px] = py;
            }
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Set<Character>[] arr = new Set[26];

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i), b = s2.charAt(i);
            if (arr[a - 'a'] == null && arr[b - 'a'] == null) {
                Set<Character> set = new TreeSet<>();
                set.add(a);
                set.add(b);
                arr[a - 'a'] = set;
                arr[b - 'a'] = set;
            } else if (arr[a - 'a'] == null && arr[b - 'a'] != null) {
                Set<Character> set = arr[b - 'a'];
                set.add(a);
                arr[a - 'a'] = set;
            } else if (arr[a - 'a'] != null && arr[b - 'a'] == null) {
                Set<Character> set = arr[a - 'a'];
                set.add(b);
                arr[b - 'a'] = set;
            } else {
                arr[a - 'a'].add(b);
                arr[b - 'a'].add(a);
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            Set<Character> first = arr[i];
            if (first != null) {
                for (int j = i + 1; j < arr.length; j++) {
                    Set<Character> second = arr[j];
                    for (char c : first) {
                        if (second != null && second.contains(c)) {
                            first.addAll(second);
                            arr[j] = first;
                            break;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            if (arr[c - 'a'] == null) sb.append(c);
            else {
                for (char curr : arr[c - 'a']) {
                    sb.append(curr);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
