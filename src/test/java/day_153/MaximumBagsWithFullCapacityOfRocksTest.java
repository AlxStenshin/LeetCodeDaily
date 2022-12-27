package day_153;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumBagsWithFullCapacityOfRocksTest {

    @Test
    void shouldReturnFillOnlyThreeBags() {
        int[] capacity = new int[]{2, 3, 4, 5};
        int[] rocks = new int[]{1, 2, 4, 4};
        int additionalRocks = 2;

        assertEquals(3, new MaximumBagsWithFullCapacityOfRocks().maximumBags(capacity, rocks, additionalRocks));
    }

    @Test
    void shouldReturnFillAllThreeBags() {
        int[] capacity = new int[]{10, 2, 2};
        int[] rocks = new int[]{2, 2, 0};
        int additionalRocks = 100;

        assertEquals(3, new MaximumBagsWithFullCapacityOfRocks().maximumBags(capacity, rocks, additionalRocks));
    }

}