package day_108;

import java.util.ArrayList;

/**
 * <a href = "https://leetcode.com/problems/find-median-from-data-stream/">
 * 295. Find Median from Data Stream </a>
 * <p>
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
 * <p>
 * For example, for arr = [2,3,4], the median is 3.
 * <p>
 * For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 * <p>
 * Implement the MedianFinder class
 */

public class MedianFinder {
    ArrayList<Integer> nums;

    public MedianFinder() {
        nums = new ArrayList<>();
    }

    public void addNum(int num) {
        if (nums.size() == 0) {
            nums.add(num);
        } else {
            int index = findInsertIndex(num);
            if (index == nums.size()) {
                nums.add(num);
            } else {
                nums.add(index, num);
            }
        }
    }

    public double findMedian() {
        int middleIndex = (nums.size() - 1) / 2;
        return nums.size() % 2 == 0 ? (nums.get(middleIndex) + nums.get(middleIndex + 1)) / 2.0 : nums.get(middleIndex);
    }

    public int findInsertIndex(int target) {
        int low = 0;
        int high = nums.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums.get(mid) >= target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
