package day_065;

import java.util.*;

import static java.util.stream.Collectors.toMap;


/**
 * <a href=https://leetcode.com/problems/the-skyline-problem/">
 *     218. The Skyline Problem</a>
 * <p>
 * A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance.
 * Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.
 * <p>
 * The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:
 * <p>
 * lefti is the x coordinate of the left edge of the ith building.
 * <p>
 * righti is the x coordinate of the right edge of the ith building.
 * <p>
 * heighti is the height of the ith building.
 * <p>
 * You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.
 * <p>
 * The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...].
 * <p>
 * Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list,
 * which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends.
 * <p>
 * Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.
 * <p>
 * Note: There must be no consecutive horizontal lines of equal height in the output skyline.
 * <p>
 * For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable;
 * the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]
 */

public class TheSkylineProblem {
    public List<List<Integer>> getSkylineTreeMap(int[][] buildings) {

        List<List<Integer>> ans = new ArrayList<>();
        SkyLinePoint[] points = new SkyLinePoint[buildings.length * 2];

        int index = 0;
        for (int[] building : buildings) {

            int left = building[0];
            int right = building[1];
            int height = building[2];

            SkyLinePoint start = new SkyLinePoint(left, height, true);
            points[index] = start;
            index++;

            SkyLinePoint end = new SkyLinePoint(right, height, false);
            points[index] = end;
            index++;
        }

        Arrays.sort(points);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 1);

        int prevMax = 0;
        for (SkyLinePoint point : points) {
            if (point.isStart)
                map.put(point.height, map.getOrDefault(point.height, 0) + 1);

            else {
                int value = map.get(point.height);
                if (value - 1 == 0)
                    map.remove(point.height);
                else
                    map.put(point.height, value - 1);
            }

            int currentMax = map.lastKey();
            if (currentMax != prevMax) {
                ans.add(Arrays.asList(point.start, currentMax));
                prevMax = currentMax;
            }
        }
        return ans;
    }

    static class SkyLinePoint implements Comparable<SkyLinePoint> {
        int start;
        int height;
        boolean isStart;

        public SkyLinePoint(int start, int height, boolean isStart) {
            this.start = start;
            this.height = height;
            this.isStart = isStart;
        }

        public int compareTo(SkyLinePoint curr) {
            if (this.start != curr.start) return this.start - curr.start;
            else {
                return ((this.isStart) ? -this.height : this.height) - ((curr.isStart) ? -curr.height : curr.height);
            }
        }
    }

    public List<List<Integer>> getSkylineGreedySolution(int[][] buildings) {
        Map<Integer, List<Integer>> heightMap = new HashMap<>();
        int minLeft = Integer.MAX_VALUE;
        int maxRight = 0;

        for (int[] building : buildings) {

            int left = building[0];
            int right = building[1];
            int height = building[2];

            maxRight = Integer.max(right, maxRight);
            minLeft = Integer.min(left, minLeft);

            for (int i = left; i < right; i++) {
                List<Integer> value = heightMap.getOrDefault(i, new ArrayList<>());
                value.add(height);
                heightMap.put(i, value);
            }
        }

        // Filling spaces with zeroes
        for (int i = minLeft; i < maxRight; i++) {
            heightMap.putIfAbsent(i, List.of(0));
        }

        // Reducing all buildings height to their maximum
        Map<Integer, Integer> topsMap = heightMap.entrySet().stream()
                .collect(toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream().reduce(Integer::max).get()));


        // Skipping duplicates
        List<List<Integer>> result = new ArrayList<>();
        int previous = 0;
        int max = 0;
        for (var e : topsMap.entrySet()) {
            if (e.getValue() != previous) {
                result.add(List.of(e.getKey(), e.getValue()));
            }
            previous = e.getValue();
            max = Math.max(max, e.getKey());
        }
        result.add(List.of(max+1, 0));
        return result;
    }
}
