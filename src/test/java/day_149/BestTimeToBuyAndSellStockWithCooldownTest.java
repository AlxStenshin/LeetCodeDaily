package day_149;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    void shouldReturnThree() {
        int[] prices = new int[]{1,2,3,0,2};
        int expected = 3;

        assertEquals(expected, new BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices));
    }

    @Test
    void shouldReturnZero() {
        int[] prices = new int[]{1};
        int expected = 0;

        assertEquals(expected, new BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices));
    }

}