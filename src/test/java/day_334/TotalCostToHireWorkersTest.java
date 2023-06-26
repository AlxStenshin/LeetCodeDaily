package day_334;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCostToHireWorkersTest {

    @Test
    void shouldReturnEleven() {
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3;
        int candidates = 4;

        assertEquals(11, new TotalCostToHireWorkers().totalCost(costs, k, candidates));
    }

    @Test
    void shouldReturnFour() {
        int[] costs = {1, 2, 4, 1};
        int k = 3;
        int candidates = 3;

        assertEquals(4, new TotalCostToHireWorkers().totalCost(costs, k, candidates));
    }
}