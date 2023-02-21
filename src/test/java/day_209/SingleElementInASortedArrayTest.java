package day_209;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementInASortedArrayTest {

    @Test
    void shouldReturnTwo() {
        int[] nums = {1,1,2,3,3,4,4,8,8};

        assertEquals(2, new SingleElementInASortedArray().singleNonDuplicate(nums));
    }

    @Test
    void shouldReturnTen() {
        int[] nums = {3,3,7,7,10,11,11};

        assertEquals(10, new SingleElementInASortedArray().singleNonDuplicate(nums));
    }

}