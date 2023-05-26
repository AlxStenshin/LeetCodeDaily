package day_303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameTwoTest {

    @Test
    void shouldReturnTen() {
        int[] piles = {2, 7, 9, 4, 4};
        int expected = 10;

        assertEquals(expected, new StoneGameTwo().stoneGameII(piles));
    }

    @Test
    void shouldReturnOneHundredFour() {
        int[] piles = {1, 2, 3, 4, 5, 100};
        int expected = 104;

        assertEquals(expected, new StoneGameTwo().stoneGameII(piles));
    }
}