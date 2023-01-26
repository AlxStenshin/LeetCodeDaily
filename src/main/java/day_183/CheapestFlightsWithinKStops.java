package day_183;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/cheapest-flights-within-k-stops/">
 * 787. Cheapest Flights Within K Stops </a>
 * <p>
 * There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.
 * <p>
 * You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.
 */

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Distance from source to all other nodes.
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Run only K+1 times since we want the shortest distance in K hops
        for (int i = 0; i <= k; i++) {
            // Create a copy of dist vector.
            int[] temp = Arrays.copyOf(dist, n);
            for (int[] flight : flights) {
                if (dist[flight[0]] != Integer.MAX_VALUE) {
                    temp[flight[1]] = Math.min(temp[flight[1]], dist[flight[0]] + flight[2]);
                }
            }
            // Copy the temp vector into dist.
            dist = temp;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}





