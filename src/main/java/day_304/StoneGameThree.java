package day_304;

/**
 * <a href = "https://leetcode.com/problems/stone-game-iii" >
 * 1406. Stone Game III </a>
 * <p>
 * Alice and Bob continue their games with piles of stones. There are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.
 * <p>
 * Alice and Bob take turns, with Alice starting first. On each player's turn, that player can take 1, 2, or 3 stones from the first remaining stones in the row.
 * <p>
 * The score of each player is the sum of the values of the stones taken. The score of each player is 0 initially.
 * <p>
 * The objective of the game is to end with the highest score, and the winner is the player with the highest score and there could be a tie. The game continues until all the stones have been taken.
 * <p>
 * Assume Alice and Bob play optimally.
 * <p>
 * Return "Alice" if Alice will win, "Bob" if Bob will win, or "Tie" if they will end the game with the same score.
 */

public class StoneGameThree {
    public String stoneGameIII(int[] stoneValue) {
        int len = stoneValue.length;
        int[] dp = new int[3];

        for (int i = len - 1; i >= 0; i--) {
            int takeOne = stoneValue[i] - dp[(i + 1) % 3];

            int takeTwo = Integer.MIN_VALUE;
            if (i + 1 < len)
                takeTwo = stoneValue[i] + stoneValue[i + 1] - dp[(i + 2) % 3];

            int takeThree = Integer.MIN_VALUE;
            if (i + 2 < len)
                takeThree = stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[(i + 3) % 3];

            dp[i % 3] = Math.max(Math.max(takeOne, takeTwo), takeThree);
        }

        int value = dp[0];
        if (value > 0)
            return "Alice";
        else if (value < 0)
            return "Bob";
        else
            return "Tie";
    }
}
