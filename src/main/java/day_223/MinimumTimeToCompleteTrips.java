package day_223;

/**
 * <a href = "https://leetcode.com/problems/kth-missing-positive-number/">
 * 2187. Minimum Time to Complete Trips </a>
 * <p>
 * You are given an array time where time[i] denotes the time taken by the ith bus to complete one trip.
 * <p>
 * Each bus can make multiple trips successively; that is, the next trip can start immediately after completing the current trip. Also, each bus operates independently; that is, the trips of one bus do not influence the trips of any other bus.
 * <p>
 * You are also given an integer totalTrips, which denotes the number of trips all buses should make in total. Return the minimum time required for all buses to complete at least totalTrips trips.
 */

public class MinimumTimeToCompleteTrips {
    int[] times;
    int totalTrips;

    public long minimumTime(int[] times, int totalTrips) {
        this.times = times;
        this.totalTrips = totalTrips;

        long left = 1;
        long right = 0;
        for (int time : times) {
            right = Math.max(right, time);
        }
        right = right * totalTrips;

        long ans = right;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (checkTimeLimit(mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean checkTimeLimit(long givenTime) {
        long actualTrips = 0;
        for (int time : times) {
            actualTrips += givenTime / time;
            if (actualTrips >= totalTrips) {
                return true;
            }
        }
        return actualTrips >= totalTrips;
    }

}
