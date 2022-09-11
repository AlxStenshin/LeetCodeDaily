package day_046;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/maximum-performance-of-a-team/">
 *     1383. Maximum Performance of a Team</a>
 * <p>
 * You are given two integers n and k and two integer arrays speed and efficiency both of length n.
 * There are n engineers numbered from 1 to n. speed[i] and efficiency[i]
 * represent the speed and efficiency of the ith engineer respectively.
 * <p>
 * Choose at most k different engineers out of the n engineers to form a team with the maximum performance.
 * <p>
 * The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among
 * their engineers.
 * <p>
 * Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 109 + 7.
 */

public class MaximumPerformanceOfATeam {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] team = new int[n][2];
        for (int i = 0; i < n; i++) {
            team[i][0] = efficiency[i];
            team[i][1] = speed[i];
        }

        // Sort the engineers based on efficiency in decreasing order, as for each iteration,
        // we'll consider only players with higher efficiency.
        Arrays.sort(team, (p1, p2) -> (p2[0] - p1[0]));

        // Priority-Queue to maintain engineers with highest relative speeds with efficiencies greater than the one under iteration.
        PriorityQueue<Integer> speedQueue = new PriorityQueue<>(k);
        long teamPerformance = 0, teamSpeed = 0;

        for (int i = 0; i < n; i++) {

            // This is because a team can have atmost `k` members.
            if (speedQueue.size() >= k) {
                teamSpeed -= speedQueue.remove();
            }

            speedQueue.add(team[i][1]);
            teamSpeed += team[i][1];

            teamPerformance = Math.max(teamPerformance, teamSpeed * team[i][0]);
        }
        return (int) (teamPerformance % 1000000007);
    }
}
