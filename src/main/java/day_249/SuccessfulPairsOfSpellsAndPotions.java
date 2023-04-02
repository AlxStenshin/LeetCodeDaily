package day_249;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/successful-pairs-of-spells-and-potions/">
 * 2300. Successful Pairs of Spells and Potions </a>
 * <p>
 * You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
 * <p>
 * You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
 * <p>
 * Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
 */

public class SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            long potionPowerRequired = (success + spells[i] - 1) / spells[i];
            spells[i] = potions.length - findPotionIndex(potions, potionPowerRequired);
        }
        return spells;
    }

    public int findPotionIndex(int[] potions, long potionPowerRequired) {
        int startIndex = 0;
        int endIndex = potions.length;

        while (startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (potions[midIndex] >= potionPowerRequired)
                endIndex = midIndex;
            else
                startIndex = midIndex + 1;
        }

        return startIndex;
    }

    public int[] successfulPairs_GreedyStreams(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        for(int i = 0; i < spells.length; i++) {
            final int spellPower = spells[i];
            result[i] = (int) Arrays.stream(potions).filter(potion -> (long) potion * spellPower >= success).count();
        }
        return result;
    }
}
