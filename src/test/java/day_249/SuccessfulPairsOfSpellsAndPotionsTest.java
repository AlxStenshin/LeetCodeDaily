package day_249;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuccessfulPairsOfSpellsAndPotionsTest {

    @Test
    void shouldReturnFourZeroThree() {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] expected = {4, 0, 3};

        //- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
        //- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
        //- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
        assertArrayEquals(expected, new SuccessfulPairsOfSpellsAndPotions().successfulPairs(spells, potions, success));
    }

    @Test
    void shouldReturnTwoZeroTwo() {
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        int success = 16;
        int[] expected = {2, 0, 2};

        //- 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
        //- 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful.
        //- 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful.
        assertArrayEquals(expected, new SuccessfulPairsOfSpellsAndPotions().successfulPairs(spells, potions, success));
    }

    @Test
    void shouldReturnFourZeroThree_Greedy() {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] expected = {4, 0, 3};

        //- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
        //- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
        //- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
        assertArrayEquals(expected, new SuccessfulPairsOfSpellsAndPotions().successfulPairs_GreedyStreams(spells, potions, success));
    }

    @Test
    void shouldReturnTwoZeroTwo_Greedy() {
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        int success = 16;
        int[] expected = {2, 0, 2};

        //- 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
        //- 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful.
        //- 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful.
        assertArrayEquals(expected, new SuccessfulPairsOfSpellsAndPotions().successfulPairs_GreedyStreams(spells, potions, success));
    }

}