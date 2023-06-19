package day_327;

/**
 * <a href = "https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/" >
 * 1732. Find the Highest Altitude </a>
 * <p>
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentMax = 0;
        int currentAlt = 0;

        for (int j : gain) {
            currentAlt += j;
            currentMax = Math.max(currentAlt, currentMax);
        }
        return currentMax;
    }
}
