package day_154;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStonesToMinimizeTheTotalTest {

    @Test
    void shouldReturnTwelve() {
        int[] piles = new int[]{4, 5, 9};
        int k = 2;

        assertEquals(12, new RemoveStonesToMinimizeTheTotal().minStoneSum(piles, k));
    }

    @Test
    void shouldAlsoReturnTwelve() {
        int[] piles = new int[]{4, 3, 6, 7};
        int k = 3;

        assertEquals(12, new RemoveStonesToMinimizeTheTotal().minStoneSum(piles, k));
    }

}