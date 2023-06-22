package day_330;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    void shouldReturnEight() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int expected = 8;

        assertEquals(expected, new BestTimeToBuyAndSellStockWithTransactionFee().maxProfit(prices, fee));
    }

    @Test
    void shouldReturnSix() {
        int[] prices = {1, 3, 7, 5, 10, 3};
        int fee = 3;
        int expected = 6;

        assertEquals(expected, new BestTimeToBuyAndSellStockWithTransactionFee().maxProfit(prices, fee));
    }
}