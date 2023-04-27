package day_274;

/**
 * <a href = "https://leetcode.com/problems/bulb-switcher/" >
 * 319. Bulb Switcher </a>
 * <p>
 * There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
 * <p>
 * On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
 * <p>
 * Return the number of bulbs that are on after n rounds.
 */

public class BulbSwitcher {
    public int bulbSwitch(int n) {
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            count++;
        }
        return count;
    }
}
