package day_044;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/">
 *     1996. The Number of Weak Characters in the Game</a>
 * <p>
 * You are playing a game that contains multiple characters, and each of the characters has two main properties:
 * attack and defense. You are given a 2D integer array properties where
 * properties[i] = [attacki, defensei] represents the properties of the ith character in the game.
 * <p>
 * A character is said to be weak if any other character has both attack and defense levels
 * strictly greater than this character's attack and defense levels.
 * More formally, a character i is said to be weak if there exists another character j where
 * attackj > attacki and defensej > defensei.
 * <p>
 * Return the number of weak characters.
 *
 */

public class TheNumberOfWeakCharactersInTheGame {
    public int numberOfWeakCharacters(int[][] properties) {

        Arrays.sort(properties, (A, B) -> (A[0] == B[0] ? A[1] - B[1] : A[0] - B[0]));

        int count = 0;
        int n = properties.length;
        int[] defence = new int[properties.length];
        int max = 0;

        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(properties[i][1], max);
            defence[i] = max;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (properties[i][0] < properties[j][0]) {
                    if (properties[i][1] < defence[j]) {
                        count++;
                    }
                    break;
                }
            }
        }

        return count;
    }
}
