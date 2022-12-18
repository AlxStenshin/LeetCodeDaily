package day_144;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    @Test
    void shouldReturnEightElementsArray() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperatures(temperatures));
    }

    @Test
    void shouldReturnFourElementsArray() {
        int[] temperatures = new int[]{30, 40, 50, 60};
        int[] expected = new int[]{1, 1, 1, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperatures(temperatures));
    }

    @Test
    void shouldReturnThreeElementsArray() {
        int[] temperatures = new int[]{30, 60, 90};
        int[] expected = new int[]{1, 1, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperatures(temperatures));
    }

    @Test
    void shouldReturnEightElementsArrayOpt() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperaturesOpt(temperatures));
    }

    @Test
    void shouldReturnFourElementsArrayOpt() {
        int[] temperatures = new int[]{30, 40, 50, 60};
        int[] expected = new int[]{1, 1, 1, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperaturesOpt(temperatures));
    }

    @Test
    void shouldReturnThreeElementsArrayOpt() {
        int[] temperatures = new int[]{30, 60, 90};
        int[] expected = new int[]{1, 1, 0};

        assertArrayEquals(expected, new DailyTemperatures().dailyTemperaturesOpt(temperatures));
    }

}