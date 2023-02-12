package day_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFuelCostToReportToTheCapitalTest {

    @Test
    void shouldReturnThree() {
        int[][] roads = {{0, 1}, {0, 2}, {0, 3}};
        int seats = 5;

        assertEquals(3, new MinimumFuelCostToReportToTheCapital().minimumFuelCost(roads, seats));
    }

    @Test
    void shouldReturnSeven() {
        int[][] roads = {{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}};
        int seats = 2;

        assertEquals(7, new MinimumFuelCostToReportToTheCapital().minimumFuelCost(roads, seats));
    }

    @Test
    void shouldReturnZero() {
        int[][] roads = {};
        int seats = 1;

        assertEquals(0, new MinimumFuelCostToReportToTheCapital().minimumFuelCost(roads, seats));
    }

}