package day_163;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumIceCreamBarsTest {

    @Test
    void shouldReturnFour() {
        int[] costs = new int[]{1, 3, 2, 4, 1};
        int coins = 7;
        assertEquals(4, new MaximumIceCreamBars().maxIceCream(costs, coins));
    }

    @Test
    void shouldReturnZero() {
        int[] costs = new int[]{10, 6, 8, 7, 7, 8};
        int coins = 5;
        assertEquals(0, new MaximumIceCreamBars().maxIceCream(costs, coins));
    }

    @Test
    void shouldReturnSix() {
        int[] costs = new int[]{1, 6, 3, 1, 2, 5};
        int coins = 20;
        assertEquals(6, new MaximumIceCreamBars().maxIceCream(costs, coins));
    }

}