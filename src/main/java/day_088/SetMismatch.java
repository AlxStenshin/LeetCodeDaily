package day_088;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/set-mismatch/">
 * 645. Set Mismatch </a>
 * <p>
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 * <p>
 * You are given an integer array nums representing the data status of this set after the error.
 * <p>
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;

        for (int num : nums) {
            if (set.contains(num))
                duplicate = num;
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                return new int[]{duplicate, i};
        }

        return new int[]{};
    }
}
