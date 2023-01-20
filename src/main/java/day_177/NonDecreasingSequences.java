package day_177;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/non-decreasing-subsequences/">
 * 491. Non-decreasing Subsequences</a>
 * <p>
 * Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements. You may return the answer in any order.
 */
public class NonDecreasingSequences {

    List<List<Integer>> result;
    public List<List<Integer>> findSubsequences(int[] nums) {
        result = new ArrayList<>();
        helper(new ArrayList<>(), nums, 0);
        return result;
    }

    public void helper(List<Integer> list, int[] nums, int start) {
        Set<Integer> set = new HashSet<>();

        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }

            set.add(nums[i]);
            if (list.size() == 0 || nums[i] >= list.get(list.size() - 1)) {
                list.add(nums[i]);
                if (list.size() > 1) {
                    result.add(new ArrayList<>(list));
                }
                helper(list, nums, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

}
