package day_112;

/**
 * <a href = "https://leetcode.com/problems/guess-number-higher-or-lower/">
 * 374. Guess Number Higher or Lower </a>
 * <p>
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <br>
 * -1: Your guess is higher than the number I picked (i.e. num > pick). <br>
 * 1: Your guess is lower than the number I picked (i.e. num < pick). <br>
 * 0: your guess is equal to the number I picked (i.e. num == pick). <p>
 * Return the number that I picked.
 */

public class GuessNumberHigherOrLower {

    private int targetNumber;

    public int guessNumber(int n) {
        return guess(n) == 0 ? n : guessNumberSearch(0, n);
    }

    private int guessNumberSearch(int l, int r) {
        int mid = l + (r - l) / 2;
        if (guess(mid) == 0) {
            return mid;
        }
        if (guess(mid) == -1) {
            return guessNumberSearch(l, mid - 1);
        } else {
            return guessNumberSearch(mid + 1, r);
        }
    }

    int guess(int num) {
        return Integer.compare(targetNumber, num);
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }
}
