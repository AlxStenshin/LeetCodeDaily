package day_213;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void shouldReturnFive() {
        int[] prices = {7,1,5,3,6,4};
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(prices));
    }


    @Test
    void shouldReturnZero() {
        int[] prices = {7,6,4,3,1};
        assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(prices));
    }

}