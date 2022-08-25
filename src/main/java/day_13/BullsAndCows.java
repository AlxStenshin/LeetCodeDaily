package day_13;

/**
 * 299. Bulls and Cows
 * https://leetcode.com/problems/bulls-and-cows/
 *
 * You are playing the Bulls and Cows game with your friend.
 *
 * You write down a secret number and ask your friend to guess what the number is.
 * When your friend makes a guess, you provide a hint with the following info:
 *
 * The number of "bulls", which are digits in the guess that are in the correct position.
 * The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position.
 * Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
 * Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
 *
 * The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows.
 * Note that both secret and guess may contain duplicate digits.
 */

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int len = secret.length();
        int[] count = new int[10];

        for (int i = 0; i < len; i++)
            count[secret.charAt(i) - '0']++;

        for (int i = 0; i < len; i++) {
            count[guess.charAt(i) - '0']--;
            if (count[guess.charAt(i) - '0'] >= 0)
                cow++;
        }

        for (int i = 0; i < len; i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                cow--;
                bull++;
            }
        }

        return bull + "A" + cow + "B";
    }
}
