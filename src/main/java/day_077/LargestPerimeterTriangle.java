package day_077;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/largest-perimeter-triangle">
 *  976. Largest Perimeter Triangle</a>
 * <p>
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 */

public class LargestPerimeterTriangle {

    public int largestPerimeterArrays(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length - 3; i >= 0; i--) {
            if(nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }

    public int largestPerimeter(int[] nums) {
        if (nums.length < 3)
            return 0;
        List<Integer> list = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> areas = new ArrayList<>();

        for (int i = 2; i < list.size(); i++) {
            areas.add(calculateArea(list.get(i), list.get(i-1), list.get(i-2)));
        }

        return areas.stream().reduce(Integer::max).orElse(0);
    }

    private int calculateArea(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0)
            return 0;

        if ((a + b > c) && (a + c > b) && (b + c > a))
            return a + b + c;
        else return 0;
    }
}
