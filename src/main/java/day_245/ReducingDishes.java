package day_245;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/reducing-dishes/">
 * 1402. Reducing Dishes </a>
 * <p>
 * A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
 * <p>
 * Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e. time[i] * satisfaction[i].
 * <p>
 * Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.
 * <p>
 * Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
 */

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int maxSatisfaction = 0;
        int currentSum = 0;
        for (int i = satisfaction.length - 1; i >= 0 && currentSum + satisfaction[i] > 0; i--) {
            currentSum += satisfaction[i];
            maxSatisfaction += currentSum;
        }
        return maxSatisfaction;
    }
}
