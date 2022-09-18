package day_053;

import java.util.Stack;

/**
 * <a href=https://leetcode.com/problems/trapping-rain-water/">
 *     42. Trapping Rain Water</a>
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length < 2)
            return 0;

        Stack<Integer> stack = new Stack<>();
        int water = 0;
        int collumn = 0;

        while (collumn < height.length) {
            if (stack.isEmpty() || height[collumn] <= height[stack.peek()]) {
                stack.push(collumn++);
            } else {
                int prev = stack.pop();
                if (!stack.isEmpty()) {
                    // find the smaller height between the two sides
                    int minHeight = Math.min(height[stack.peek()], height[collumn]);
                    // calculate the area
                    water += (minHeight - height[prev]) * (collumn - stack.peek() - 1);
                }
            }
        }
        return water;
    }
}
