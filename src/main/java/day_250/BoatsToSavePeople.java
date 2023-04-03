package day_250;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/boats-to-save-people/">
 * 881. Boats to Save People </a>
 * <p>
 * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person.
 */

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);

        int fatPointer = people.length - 1;
        int skinnyPointer = 0;

        while (skinnyPointer <= fatPointer) {
            if (people[skinnyPointer] + people[fatPointer] <= limit) {
                skinnyPointer++;
            }
            fatPointer--;
            boatCount++;
        }
        return  boatCount;

    }
}
