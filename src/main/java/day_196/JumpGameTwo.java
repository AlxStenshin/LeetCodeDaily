package day_196;

/**
 * <a href = "https://leetcode.com/problems/jump-game-ii/" >
 * 45. Jump Game II </a>
 * <p>
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <p>
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * <p>
 * 0 <= j <= nums[i] and  i + j < n
 * <p>
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 */

public class JumpGameTwo {
    public int jump(int[] nums) {
        int size = nums.length - 1;

        int max = 0;
        int curr = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            max = Math.max(max, i + nums[i]);
            if (curr == i) {
                curr = max;
                count++;
            }

            if (curr > size) {
                return count;
            }
        }
        return count;
    }
}
