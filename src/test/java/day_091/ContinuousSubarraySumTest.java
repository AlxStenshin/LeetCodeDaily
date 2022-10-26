package day_091;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubarraySumTest {

    @Test
    void shouldReturnTrueIfInputContainsTargetSum() {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumSimplified(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumHashing(new int[]{23, 2, 4, 6, 7}, 6));

    }

    @Test
    void shouldReturnTrueIfInputContainsTargetSumWithMultiplier() {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumSimplified(new int[]{23, 2, 6, 4, 7}, 6));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumHashing(new int[]{23, 2, 6, 4, 7}, 6));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
        assertFalse(new ContinuousSubarraySum().checkSubarraySumSimplified(new int[]{23, 2, 6, 4, 7}, 13));
        assertFalse(new ContinuousSubarraySum().checkSubarraySumHashing(new int[]{23, 2, 6, 4, 7}, 13));
    }

    @Test
    void shouldReturnTrue() {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(new int[]{23,2,4,6,6}, 7));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumSimplified(new int[]{23,2,4,6,6}, 7));
        assertTrue(new ContinuousSubarraySum().checkSubarraySumHashing(new int[]{23,2,4,6,6}, 7));
    }
}