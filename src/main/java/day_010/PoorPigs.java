package day_010;

/**
 * 458. Poor Pigs
 * https://leetcode.com/problems/poor-pigs/
 *
 * There are buckets buckets of liquid, where exactly one of the buckets is poisonous.
 * To figure out which one is poisonous, you feed some number of (poor) pigs the liquid to see whether they will die or not.
 * Unfortunately, you only have minutesToTest minutes to determine which bucket is poisonous.
 *
 * You can feed the pigs according to these steps:
 *
 * Choose some live pigs to feed.
 * For each pig, choose which buckets to feed it. The pig will consume all the chosen buckets simultaneously
 * and will take no time.
 * Wait for minutesToDie minutes. You may not feed any other pigs during this time.
 * After minutesToDie minutes have passed, any pigs that have been fed the poisonous bucket will die,
 * and all others will survive.
 * Repeat this process until you run out of time.
 * Given buckets, minutesToDie, and minutesToTest, return the minimum number of pigs needed to figure out which bucket
 * is poisonous within the allotted time.
 */

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // If we get N pig and can test T times,
        // the maximum number of buckets that we can successfully
        // detect the poison among them is (T+1)^N.

        int testCount = minutesToTest / minutesToDie;
        int i = 0;
        while (Math.pow(testCount + 1, i) < buckets) {
            i++;
        }
        return i;
    }
}
