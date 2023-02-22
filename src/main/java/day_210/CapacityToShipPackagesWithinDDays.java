package day_210;

/**
 * <a href = "https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/">
 * 1011. Capacity To Ship Packages Within D Days </a>
 * <p>
 * A conveyor belt has packages that must be shipped from one port to another within days days.
 * <p>
 * The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
 * <p>
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
 */

public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int i : weights) {
            left = Math.max(left, i);
            right += i;
        }

        int mid;
        int ans = right;

        while (left <= right) {
            mid = (left + right) / 2;
            if (check(weights, days, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean check(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currWeight = 0;
        for (int i : weights) {
            if (currWeight + i > capacity) {
                requiredDays++;
                currWeight = 0;
            }
            currWeight += i;
        }
        return requiredDays <= days;
    }

}
