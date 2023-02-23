package day_211;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/ipo/">
 * 502. IPO </a>
 * <p>
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.
 * <p>
 * You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
 * <p>
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
 * <p>
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
 * <p>
 * The answer is guaranteed to fit in a 32-bit signed integer.
 * */

public class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int count = profits.length;
        Project[] projects = new Project[count];
        for (int i = 0; i < count; i++) {
            projects[i] = new Project(capital[i], profits[i]);
        }

        Arrays.sort(projects);
        PriorityQueue<Integer> profitQueue = new PriorityQueue<>(count, Collections.reverseOrder());
        int unavailableProjectIndex = 0;
        for (int i = 0; i < k; i++) {
            while (unavailableProjectIndex < count && projects[unavailableProjectIndex].capital <= w) {
                profitQueue.add(projects[unavailableProjectIndex++].profit);
            }
            if (profitQueue.isEmpty()) {
                break;
            }
            w += profitQueue.poll();
        }
        return w;
    }
}

class Project implements Comparable<Project> {
    int capital, profit;

    public Project(int capital, int profit) {
        this.capital = capital;
        this.profit = profit;
    }

    public int compareTo(Project project) {
        return capital - project.capital;
    }
}

