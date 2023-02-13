package day_201;

/**
 * <a href = "https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/" >
 * 1523. Count Odd Numbers in an Interval Range </a>
 * <p>
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 */

public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int odd = (high - low) / 2;
        if (low % 2 == 1 || high % 2 == 1)
            odd++;
        return odd;
    }

}
