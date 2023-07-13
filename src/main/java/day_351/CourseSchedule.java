package day_351;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/course-schedule/" >
 * 207. Course Schedule </a>
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 */

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && dfsDetectCycle(graph, visited, i))
                return false;
        }
        return true;
    }

    private boolean dfsDetectCycle(List<List<Integer>> graph, int[] visited, int prere) {
        visited[prere] = -1;
        for (Integer course : graph.get(prere)) {
            if (visited[course] == -1)
                return true;
            else if (visited[course] == 0 && dfsDetectCycle(graph, visited, course))
                return true;
        }
        visited[prere] = 1;
        return false;
    }
}
