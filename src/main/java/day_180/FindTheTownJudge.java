package day_180;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/find-the-town-judge/">
 * 997. Find the Town Judge </a>
 * <p>
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.<br>
 * Everybody (except for the town judge) trusts the town judge.<br>
 * There is exactly one person that satisfies properties 1 and 2.<br>
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.<br>
 * <p>
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 *
 */

public class FindTheTownJudge {

    public int findJudgeOptimized(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;

        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int person = 0; person < count.length; person++) {
            if (count[person] == n - 1) return person;
        }

        return -1;
    }

    public int findJudge(int n, int[][] trust) {
        Map<Integer, List<Integer>> trustMap = new HashMap<>();

        for (int[] t : trust) {
            List<Integer> currentValues = trustMap.getOrDefault(t[0], new ArrayList<>());
            currentValues.add(t[1]);
            trustMap.put(t[0], currentValues);

        }

        for (int i = 1; i <= n; i++) {
            int finalI = i;
            if (trustMap.values().stream().allMatch(e -> e.contains(finalI)) &&
                    (long) trustMap.values().size() == n-1) {
                return i;
            }
        }

        return -1;
    }
}
