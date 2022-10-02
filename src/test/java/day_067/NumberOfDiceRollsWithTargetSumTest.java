package day_067;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiceRollsWithTargetSumTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(1, 6, 3));
    }

    @Test
    void shouldReturnSix() {
        assertEquals(6, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 7));
    }

    @Test
    void shouldReturnModulo() {
        assertEquals(222616187, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(30, 30, 500));
    }

}