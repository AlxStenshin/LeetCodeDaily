package day_068;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href=https://leetcode.com/problems/minimum-time-to-make-rope-colorful/">
 *   1578. Minimum Time to Make Rope Colorful</a>
 * <p>
 * Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
 * <p>
 * Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
 * <p>
 * Return the minimum time Bob needs to make the rope colorful.
 */

public class MinimumTimeToMakeRopeColorful {

    public int minCost(String colors, int[] neededTime) {
        int size = colors.length();
        int result = 0;

        for (int i = 1; i < size; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                result = result + Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return result;
    }

    public int minCostGreedy(String colors, int[] neededTime) {
        List<Integer> cost = new ArrayList<>();
        cutTheRope(colors, neededTime, cost);
        return cost.stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    void cutTheRope(String colors, int[] neededTime, List<Integer> cost) {
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i-1)) {
                int indexToRemove = (neededTime[i-1] <= neededTime[i]) ? i - 1 : i;
                cost.add(neededTime[indexToRemove]);
                colors = new StringBuilder(colors).deleteCharAt(indexToRemove).toString();
                neededTime = removeFromArrayByIndex(neededTime, indexToRemove);
                cutTheRope(colors, neededTime, cost);
                break;
            }
        }
    }

    int[] removeFromArrayByIndex(int[] arr, int index) {
        List<Integer> arrayList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        arrayList.remove(index);
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
