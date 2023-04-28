package day_275;

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
