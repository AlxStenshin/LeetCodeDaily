package day_164;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/gas-station/">
 * 134. Gas Station </a>
 * <p>
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * <p>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 */

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum())
            return -1;

        int gasLeft = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            gasLeft = gasLeft + (gas[i] - cost[i]);
            if (gasLeft < 0) {
                startStation = i + 1;
                gasLeft = 0;
            }
        }
        return startStation;
    }
}
