package day_162;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <a href = "https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">
 * 452. Minimum Number of Arrows to Burst Balloons </a>
 * <p>
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
 * <p>
 * Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
 * <p>
 * Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 */

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        int arrowCount = 0;

        PriorityQueue<int[]> balloonQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        balloonQueue.addAll(Arrays.asList(points));

        if (balloonQueue.isEmpty())
            return 0;

        while (!balloonQueue.isEmpty()) {
            int[] previous = balloonQueue.poll();

            while (!balloonQueue.isEmpty() &&
                    previous[1] >= balloonQueue.peek()[0]
                    && previous[1] <= balloonQueue.peek()[1]) {
                balloonQueue.poll();
            }
            arrowCount++;
        }

        return arrowCount;
    }
}
