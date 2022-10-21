package day_086;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href = "https://leetcode.com/problems/contains-duplicate-ii/">
 * 219. Contains Duplicate II</a>
 * <p>
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

public class ContainsDuplicateTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer ord = map.put(nums[i], i);
            if (ord != null && i - ord <= k) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateTwoPointers(int[] nums, int k) {
        int firsPointer = 0;
        int secondPointer = k;

        List<Boolean> results = new ArrayList<>();

        for (int i = 0; i < nums.length - k; i++) {
            if (nums[firsPointer] == nums[secondPointer])
                results.add(true);
            else
                results.add(false);

            firsPointer++;
            secondPointer++;
        }

        return results.stream().anyMatch(r -> r);
    }
}
