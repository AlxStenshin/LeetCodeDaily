package day_275;

/**
 * <a href = "https://leetcode.com/problems/similar-string-groups/" >
 * 839. Similar String Groups </a>
 * <p>
 * Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y. Also two strings X and Y are similar if they are equal.
 * <p>
 * For example, "tars" and "rats" are similar (swapping at positions 0 and 2), and "rats" and "arts" are similar, but "star" is not similar to "tars", "rats", or "arts".
 * <p>
 * Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.  Notice that "tars" and "arts" are in the same group even though they are not similar.  Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.
 * <p>
 * We are given a list strs of strings where every string in strs is an anagram of every other string in strs. How many groups are there?
 */

public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        int groups = 0;
        int length = strs.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;
            groups++;
            dfs(i, strs, visited);
        }
        return groups;
    }

    void dfs(int i, String[] strs, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < strs.length; j++) {
            if (visited[j]) continue;
            if (isSimilar(strs[i], strs[j])) {
                dfs(j, strs, visited);
            }
        }
    }

    boolean isSimilar(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
        }
        return (count == 2 || count == 0);
    }
}
