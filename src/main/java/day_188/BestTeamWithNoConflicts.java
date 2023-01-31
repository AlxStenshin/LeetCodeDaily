package day_188;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/best-team-with-no-conflicts/">
 * 1626. Best Team With No Conflicts </a>
 * <p>
 * You are the manager of a basketball team. For the upcoming tournament, you want to choose the team with the highest overall score. The score of the team is the sum of scores of all the players in the team.
 * <p>
 * However, the basketball team is not allowed to have conflicts. A conflict exists if a younger player has a strictly higher score than an older player. A conflict does not occur between players of the same age.
 * <p>
 * Given two lists, scores and ages, where each scores[i] and ages[i] represents the score and age of the ith player, respectively, return the highest overall score of all possible basketball teams.
 */

public class BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int size = scores.length;
        Player[] players = new Player[size];

        for (int i = 0; i < size; i++) {
            players[i] = new Player(scores[i], ages[i]);
        }

        Arrays.sort(players, (p1, p2) -> p1.score == p2.score ?
                Integer.compare(p1.age, p2.age) : Integer.compare(p1.score, p2.score));

        int[] dp = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            dp[i] = search(dp, players, i) + players[i].score;
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    private int search(int[] dp, Player[] players, int i) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (dp[j] > max && players[j].age <= players[i].age) {
                max = dp[j];
            }
        }
        return max;
    }

    private static class Player {
        final int score;
        final int age;

        public Player(int score, int age) {
            this.score = score;
            this.age = age;
        }
    }
}
