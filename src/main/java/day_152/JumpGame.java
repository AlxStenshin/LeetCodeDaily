package day_152;

/**
 * <a href="https://leetcode.com/problems/jump-game/">
 *     55. Jump Game </a>
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 */

public class JumpGame {
    public boolean canJump(int[] nums) {
        int max = 0;
        int i = 0;
        while (max < nums.length - 1) {
            if (i > max)
                return false;
            max = Math.max(max, i + nums[i]);
            i++;
        }
        return true;
    }
}
