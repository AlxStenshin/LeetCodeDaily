package day_342;

/**
 * <a href = "https://leetcode.com/problems/single-number-ii/" >
 * 137. Single Number II </a>
 * <p>
 * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class SingleNumberTwo {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if (sum != 0) {
                ans |= sum << i;
            }
        }
        return ans;
    }
}
