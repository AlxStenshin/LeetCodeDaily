package day_024;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 871. Minimum Number of Refueling Stops
 * https://leetcode.com/problems/minimum-number-of-refueling-stops/
 *
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 *
 * There are gas stations along the way.
 * The gas stations are represented as an array stations where stations[i] = [position-i, fuel-i] indicates
 * that the ith gas station is position-i miles east of the starting position and has fuel-i liters of gas.
 *
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.
 * It uses one liter of gas per one mile that it drives.
 * When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 *
 * Return the minimum number of refueling stops the car must make in order to reach its destination.
 * If it cannot reach the destination, return -1.
 *
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there.
 * If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 *
 */
public class MinimumNumberOfRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        // We will create a priority queue which will store the the fuels (arr[i][1]) in descending order
        // The stations with more fuel will be ahead (reverse sorting) so that max fuel can be taken when needed

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int countStops = 0;
        int currStation = 0;
        int currFuel = startFuel;

        // Loop till current fuel is less than required fuel. Else return as currFuel is sufficient to reach target.
        while (currFuel < target) {

            // Traverse next station till current station are not completed.
            // and current fuel is more than sufficient to reach current station
            while (currStation < stations.length && currFuel >= stations[currStation][0]) {
                pq.add(stations[currStation][1]);
                currStation++;
            }

            // If at any time no element present, means till we reach nearest fuel pump, car already exhausted.
            if (pq.size() <= 0) {
                return -1;  // not possible.
            }

            // When above while loop breaks, then update current fuel to add more Max(fuels seen till now)
            currFuel = currFuel + pq.remove();
            countStops++;
        }
        return countStops;
    }
}
