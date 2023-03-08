package day_224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

    @Test
    void shouldReturnFour() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        assertEquals(4, new KokoEatingBananas().minEatingSpeed(piles, h));
    }

    @Test
    void shouldReturnThirty() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;

        assertEquals(30, new KokoEatingBananas().minEatingSpeed(piles, h));
    }

    @Test
    void shouldReturnTwentyThree() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;

        assertEquals(23, new KokoEatingBananas().minEatingSpeed(piles, h));
    }

}