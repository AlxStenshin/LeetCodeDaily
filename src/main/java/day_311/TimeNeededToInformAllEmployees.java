package day_311;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/time-needed-to-inform-all-employees/" >
 * 1376. Time Needed to Inform All Employees </a>
 * <p>
 * A company has n employees with a unique ID for each employee from 0 to n - 1. The head of the company is the one with headID.
 * <p>
 * Each employee has one direct manager given in the manager array where manager[i] is the direct manager of the i-th employee, manager[headID] = -1. Also, it is guaranteed that the subordination relationships have a tree structure.
 * <p>
 * The head of the company wants to inform all the company employees of an urgent piece of news. He will inform his direct subordinates, and they will inform their subordinates, and so on until all employees know about the urgent news.
 * <p>
 * The i-th employee needs informTime[i] minutes to inform all of his direct subordinates (i.e., After informTime[i] minutes, all his direct subordinates can start spreading the news).
 * <p>
 * Return the number of minutes needed to inform all the employees about the urgent news.
 */

public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.computeIfAbsent(manager[i], k -> new ArrayList<>()).add(i);
            }
        }

        return dfs(headID, informTime, adjList);
    }

    private int dfs(int manager, int[] informTime, Map<Integer, List<Integer>> adjList) {
        int maxTime = 0;
        if (adjList.containsKey(manager)) {
            for (int subordinate : adjList.get(manager)) {
                maxTime = Math.max(maxTime, dfs(subordinate, informTime, adjList));
            }
        }
        return maxTime + informTime[manager];
    }
}
