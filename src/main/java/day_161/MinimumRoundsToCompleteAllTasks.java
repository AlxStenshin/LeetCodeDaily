package day_161;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/">
 * 2244. Minimum Rounds to Complete All Tasks </a>
 * <p>
 * You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
 * <p>
 * Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
 */

public class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> taskMap = new HashMap<>();

        for (int t : tasks) {
            taskMap.put(t, taskMap.getOrDefault(t, 0) + 1);
        }

        if (taskMap.entrySet().stream().anyMatch(e -> e.getValue() < 2))
            return -1;

        int roundsCount = 0;

        for (var e : taskMap.entrySet()) {
            int count = e.getValue();
            roundsCount += count / 3;
            if (count % 3 != 0)
                roundsCount++;
        }
        return roundsCount;
    }
}
