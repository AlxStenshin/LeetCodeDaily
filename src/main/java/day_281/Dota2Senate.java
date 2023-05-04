package day_281;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href = "https://leetcode.com/problems/dota2-senate/">
 * 649. Dota2 Senate </a>
 * <p>
 * In the world of Dota2, there are two parties: the Radiant and the Dire.
 * <p>
 * The Dota2 senate consists of senators coming from two parties. Now the Senate wants to decide on a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise one of the two rights:
 * <p>
 * Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
 * Announce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.
 * Given a string senate representing each senator's party belonging. The character 'R' and 'D' represent the Radiant party and the Dire party. Then if there are n senators, the size of the given string will be n.
 * <p>
 * The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.
 * <p>
 * Suppose every senator is smart enough and will play the best strategy for his own party. Predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".
 **/

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int length = senate.length();
        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R')
                radiantQueue.add(i);
            else
                direQueue.add(i);
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int r_i = radiantQueue.poll();
            int d_i = direQueue.poll();
            if (r_i < d_i) radiantQueue.add(r_i + length);
            else direQueue.add(d_i + length);
        }
        return radiantQueue.size() > direQueue.size() ? "Radiant" : "Dire";
    }
}
