package day_110;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/">
 * 947. Most Stones Removed with Same Row or Column </a>
 * <p>
 * On a 2D plane, we place n stones at some integer coordinate points. Each coordinate point may have at most one stone.
 * <p>
 * A stone can be removed if it shares either the same row or the same column as another stone that has not been removed.
 * <p>
 * Given an array stones of length n where stones[i] = [xi, yi] represents the location of the ith stone, return the largest possible number of stones that can be removed.
 */

public class MostStonesRemovedWithSameRowOrColumn {
    public int removeStones(int[][] stones) {

        boolean[] visited = new boolean[stones.length];
        HashMap<Integer, List<Integer>> row = new HashMap<>();
        HashMap<Integer, List<Integer>> col = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            row.computeIfAbsent(stones[i][0], o -> new ArrayList<>()).add(i);
            col.computeIfAbsent(stones[i][1], o -> new ArrayList<>()).add(i);
        }

        int stoneGroupLeffotvers = 0;
        for (int i = 0; i < stones.length; i++)
            if (!visited[i]) {
                removeIsland(visited, stones, i, row, col);
                stoneGroupLeffotvers++;
            }

        return stones.length - stoneGroupLeffotvers;
    }

    private void removeIsland(boolean[] visited, int[][] stones, int idx,
                              Map<Integer, List<Integer>> row,
                              Map<Integer, List<Integer>> col) {
        if (visited[idx]) return;

        visited[idx] = true;
        int r = stones[idx][0];
        int c = stones[idx][1];
        for (int index : row.get(r))
            removeIsland(visited, stones, index, row, col);

        for (int index : col.get(c))
            removeIsland(visited, stones, index, row, col);
    }
}
