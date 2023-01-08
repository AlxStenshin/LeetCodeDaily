package day_165;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/gas-station/">
 * 149. Max Points on a Line </a>
 * <p>
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
 */

public class MaxPointsOnLine {
    public int maxPoints(int[][] points) {
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> freqMap = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;

                double angle = calcAngle(points[i][0], points[i][1], points[j][0], points[j][1]);
                freqMap.put(angle, freqMap.getOrDefault(angle, 0) + 1);
                max = Math.max(max, freqMap.get(angle));
            }
        }
        return max + 1;
    }

    private double calcAngle(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }
}
