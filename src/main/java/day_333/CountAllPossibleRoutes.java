package day_333;

/**
 * <a href = "https://leetcode.com/problems/count-all-possible-routes/" >
 * 1575. Count All Possible Routes </a>
 * <p>
 * You are given an array of distinct positive integers locations where locations[i] represents the position of city i. You are also given integers start, finish and fuel representing the starting city, ending city, and the initial amount of fuel you have, respectively.
 * <p>
 * At each step, if you are at city i, you can pick any city j such that j != i and 0 <= j < locations.length and move to city j. Moving from city i to city j reduces the amount of fuel you have by |locations[i] - locations[j]|. Please notice that |x| denotes the absolute value of x.
 * <p>
 * Notice that fuel cannot become negative at any point in time, and that you are allowed to visit any city more than once (including start and finish).
 * <p>
 * Return the count of all possible routes from start to finish. Since the answer may be too large, return it modulo 109 + 7.
 */

public class CountAllPossibleRoutes {
    private static final int MOD = 1000000007;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        Integer[][] memo = new Integer[n][fuel + 1];
        return helper(locations, start, finish, fuel, memo);
    }

    public int helper(int[] locations, int city, int finish, int remainFuel, Integer[][] memo) {
        if (remainFuel < 0) {
            return 0;
        }

        if (memo[city][remainFuel] != null) {
            return memo[city][remainFuel];
        }

        int total = city == finish ? 1 : 0;

        for (int nextCity = 0; nextCity < locations.length; nextCity++) {
            if (nextCity != city && remainFuel >= Math.abs(locations[nextCity] - locations[city])) {
                total = (total + helper(locations, nextCity, finish, remainFuel - Math.abs(locations[nextCity] - locations[city]), memo)) % MOD;
            }
        }

        return memo[city][remainFuel] = total;
    }
}
