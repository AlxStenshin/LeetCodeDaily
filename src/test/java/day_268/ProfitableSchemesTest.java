package day_268;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfitableSchemesTest {

    @Test
    void shouldReturnTwo() {
        int n = 5;
        int minProfit = 3;
        int[] group = {2, 2};
        int[] profit = {2, 3};

        assertEquals(2, new ProfitableSchemes().profitableSchemes(n, minProfit, group, profit));
    }

    @Test
    void shouldReturnSeven() {
        int n = 10;
        int minProfit = 5;
        int[] group = {2, 3, 5};
        int[] profit = {6, 7, 8};

        assertEquals(7, new ProfitableSchemes().profitableSchemes(n, minProfit, group, profit));
    }

}