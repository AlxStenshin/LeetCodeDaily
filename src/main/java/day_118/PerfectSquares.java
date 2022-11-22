package day_118;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/perfect-squares/">
 * 279. Perfect Squares </a>
 * <p>
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 * <p>
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 */

public class PerfectSquares {

    public int numSquares(int n) {
        List<Integer> perfectSquares = new ArrayList<>();
        for (var i = 1; i * i <= n; i++)
            perfectSquares.add(i * i);

        int depth = 1;
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; --i) {
                n = queue.poll();
                for (int j = perfectSquares.size() - 1; j >= 0; --j) {
                    int diff = n - perfectSquares.get(j);
                    if (diff == 0) {
                        return depth;
                    }
                    if (diff > 0) {
                        queue.offer(diff);
                    }
                }
            }
            depth = depth + 1;
        }
        return depth;
    }
}
