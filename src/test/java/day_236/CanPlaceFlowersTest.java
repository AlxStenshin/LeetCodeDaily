package day_236;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void shouldReturnTrue() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        assertTrue(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    @Test
    void shouldReturnFalse() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;

        assertFalse(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    @Test
    void shouldReturnFalseWithEvenZerosCount() {
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        int n = 2;

        assertFalse(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    @Test
    void shouldReturnTrueWithAlreadyCorrectFlowerbed() {
        int[] flowerbed = {1, 0, 1, 0, 1, 0, 1};
        int n = 0;

        assertTrue(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    @Test
    void shouldReturnTrueIfFirstElementIsEmpty() {
        int[] flowerbed = {0, 0, 1, 0, 0};
        int n = 1;

        assertTrue(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

}