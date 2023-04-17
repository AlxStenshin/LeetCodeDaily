package day_264;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href = "https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/" >
 * 1431. Kids With the Greatest Number of Candies </a>
 * <p>
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 */

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies)
                .mapToObj(c -> c + extraCandies >= max)
                .collect(Collectors.toList());
    }
}
