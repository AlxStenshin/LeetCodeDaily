package day_004;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Input
 * ["NumArray", "sumRange", "update", "sumRange"]
 * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
 * Output
 * [null, 9, null, 8]
 *
 * Explanation
 * NumArray numArray = new NumArray([1, 3, 5]);
 * numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
 * numArray.update(1, 2);   // nums = [1, 2, 5]
 * numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
 */

class NumArrayTest {

    @Test
    void shouldPrintCorrectResults() {
        NumArray obj = new NumArray(new int[]{1, 3, 5});
        assertEquals(9, obj.sumRange(0,2));
        obj.update(1,2);
        assertEquals(8, obj.sumRange(0,2));
    }
}