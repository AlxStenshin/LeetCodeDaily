package day_115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * <a href = "https://leetcode.com/problems/erect-the-fence/">
 * 587. Erect the Fence </a>
 * <p>
 * You are given an array trees where trees[i] = [xi, yi] represents the location of a tree in the garden.
 * <p>
 * You are asked to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed.
 * <p>
 * Return the coordinates of trees that are exactly located on the fence perimeter.
 */

public class ErectTheFence {

    public int[][] outerTrees_Monotone_Chain(int[][] points) {
        Arrays.sort(points, (p, q) -> q[0] - p[0] == 0 ? q[1] - p[1] : q[0] - p[0]);

        Stack<int[]> hull = new Stack<>();
        for (int[] point : points) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), point) > 0)
                hull.pop();
            hull.push(point);
        }

        hull.pop();
        for (int i = points.length - 1; i >= 0; i--) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), points[i]) > 0)
                hull.pop();
            hull.push(points[i]);
        }

        // remove redundant elements from the stack
        HashSet<int[]> ret = new HashSet<>(hull);
        return ret.toArray(new int[ret.size()][]);
    }

    public int[][] outerTrees_Jarvis(int[][] points) {
        HashSet<int[]> hull = new HashSet<>();
        if (points.length < 4) {
            hull.addAll(Arrays.asList(points));
            return hull.toArray(new int[hull.size()][]);
        }

        int left_most = 0;
        for (int i = 0; i < points.length; i++)
            if (points[i][0] < points[left_most][0])
                left_most = i;
        int p = left_most;

        do {
            int q = (p + 1) % points.length;
            for (int i = 0; i < points.length; i++) {
                if (orientation(points[p], points[i], points[q]) < 0) {
                    q = i;
                }
            }
            for (int i = 0; i < points.length; i++) {
                if (i != p && i != q && orientation(points[p], points[i], points[q]) == 0 &&
                        inBetween(points[p], points[i], points[q])) {
                    hull.add(points[i]);
                }
            }
            hull.add(points[q]);
            p = q;
        }
        while (p != left_most);
        return hull.toArray(new int[hull.size()][]);
    }

    public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }

    public boolean inBetween(int[] p, int[] i, int[] q) {
        boolean a = i[0] >= p[0] && i[0] <= q[0] || i[0] <= p[0] && i[0] >= q[0];
        boolean b = i[1] >= p[1] && i[1] <= q[1] || i[1] <= p[1] && i[1] >= q[1];
        return a && b;
    }
}
