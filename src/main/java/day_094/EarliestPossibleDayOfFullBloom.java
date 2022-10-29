package day_094;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/minimum-window-substring/">
 * 2136. Earliest Possible Day of Full Bloom </a>
 * <p>
 * You have n flower seeds. Every seed must be planted first before it can begin to grow, then bloom. Planting a seed takes time and so does the growth of a seed. You are given two 0-indexed integer arrays plantTime and growTime, of length n each:
 * <p>
 * plantTime[i] is the number of full days it takes you to plant the ith seed. Every day, you can work on planting exactly one seed. You do not have to work on planting the same seed on consecutive days, but the planting of a seed is not complete until you have worked plantTime[i] days on planting it in total.
 * growTime[i] is the number of full days it takes the ith seed to grow after being completely planted. After the last day of its growth, the flower blooms and stays bloomed forever.
 * From the beginning of day 0, you can plant the seeds in any order.
 * <p>
 * Return the earliest possible day where all seeds are blooming.
 */

public class EarliestPossibleDayOfFullBloom {

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = growTime.length;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            indices.add(i);
        }

        indices.sort(Comparator.comparingInt(i -> - growTime[i]));
        int result = 0;
        for (int i = 0, curPlantTime = 0; i < n; ++i) {
            int idx = indices.get(i);
            int time = curPlantTime + plantTime[idx] + growTime[idx];
            result = Math.max(result, time);
            curPlantTime += plantTime[idx];
        }

        return result;
    }
}
