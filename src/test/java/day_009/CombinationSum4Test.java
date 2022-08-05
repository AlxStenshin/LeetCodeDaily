package day_009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum4Test {

    /*
        Input: nums = [1,2,3], target = 4
        Output: 7
        Explanation:
        The possible combination ways are:
        (1, 1, 1, 1)
        (1, 1, 2)
        (1, 2, 1)
        (1, 3)
        (2, 1, 1)
        (2, 2)
        (3, 1)
     */
    @Test
    void shouldReturnSeven() {
        assertEquals(7, new CombinationSum4().combinationSum4(new int[]{1, 2, 3}, 4));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, new CombinationSum4().combinationSum4(new int[]{9}, 3));
    }

}