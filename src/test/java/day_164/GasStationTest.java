package day_164;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @Test
    void shouldReturnThree() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};

        assertEquals(3, new GasStation().canCompleteCircuit(gas, cost));
    }

    @Test
    void shouldReturnMinusOne() {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};

        assertEquals(-1, new GasStation().canCompleteCircuit(gas, cost));
    }

}