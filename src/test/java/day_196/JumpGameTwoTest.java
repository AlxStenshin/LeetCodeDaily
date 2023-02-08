package day_196;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTwoTest {

    @Test
    void shouldReturnTwo() {
        int[] nums = {2,3,1,1,4};
        assertEquals(2, new JumpGameTwo().jump(nums));
    }

    @Test
    void shouldAlsoReturnTwo() {
        int[] nums = {2,3,0,1,4};
        assertEquals(2, new JumpGameTwo().jump(nums));
    }

}