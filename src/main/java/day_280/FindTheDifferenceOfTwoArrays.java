package day_280;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/find-the-difference-of-two-arrays" >
 * 2215. Find the Difference of Two Arrays </a>
 * <p>
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.<p>
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.<p>
 * Note that the integers in the lists may be returned in any order.
 */

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> firstFreqMap = buildFreqMap(nums1);
        HashMap<Integer, Integer> secondFreqMap = buildFreqMap(nums2);

        return List.of(getUnique(firstFreqMap, secondFreqMap), getUnique(secondFreqMap, firstFreqMap));
    }

    private HashMap<Integer,Integer> buildFreqMap(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (var num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }

    private List<Integer> getUnique(HashMap<Integer,Integer> first, HashMap<Integer,Integer> second) {
        return first.keySet().stream()
                .filter(integer -> !second.containsKey(integer))
                .collect(Collectors.toList());
    }
}
