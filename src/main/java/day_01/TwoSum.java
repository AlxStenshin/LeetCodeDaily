package day_01;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (diffMap.containsKey(req)) {
                return new int[]{diffMap.get(req), i};
            }
            diffMap.put(nums[i], i);
            diffMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
