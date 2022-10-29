package day_094;

import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import static org.junit.jupiter.api.Assertions.*;

class EarliestPossibleDayOfFullBloomTest extends TimeSensitiveTest {

    @Test
    void shouldReturnNine() {
        int[] plantTime = new int[]{1, 4, 3};
        int[] growTime = new int[]{2, 3, 1};
        assertEquals(9, new EarliestPossibleDayOfFullBloom().earliestFullBloom(plantTime, growTime));
    }

    @Test
    void shouldReturnNineAlso() {
        int[] plantTime = new int[]{1, 2, 3, 2};
        int[] growTime = new int[]{2, 1, 2, 1};
        assertEquals(9, new EarliestPossibleDayOfFullBloom().earliestFullBloom(plantTime, growTime));
    }

    @Test
    void shouldReturnTwo() {
        int[] plantTime = new int[]{1};
        int[] growTime = new int[]{1};
        assertEquals(2, new EarliestPossibleDayOfFullBloom().earliestFullBloom(plantTime, growTime));
    }
}