package day_244;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/minimum-cost-for-tickets/">
 * 983. Minimum Cost For Tickets </a>
 * <p>
 * You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.
 * <p>
 * Train tickets are sold in three different ways:
 * <p>
 * a 1-day pass is sold for costs[0] dollars,<br>
 * a 7-day pass is sold for costs[1] dollars, and<br>
 * a 30-day pass is sold for costs[2] dollars.<br>
 * The passes allow that many days of consecutive travel.<br>
 * <p>
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 */
public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] cost = new int[366];
//        List<Integer> travelDays = Arrays.stream(days).boxed().toList();
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }

        for (int i = 1; i <= 365; i++) {
            if (!travelDays.contains(i)) {
                cost[i] = cost[i - 1];
            } else {
                int day = cost[i - 1] + costs[0];
                int week = cost[Math.max(0, i - 7)] + costs[1];
                int month = cost[Math.max(0, i - 30)] + costs[2];
                cost[i] = Math.min(day, Math.min(week, month));
            }
        }
        return cost[365];
    }
}
