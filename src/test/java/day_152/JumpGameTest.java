package day_152;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JumpGameTest {

    @Test
    void shouldReturnTrue() {
        int[] input = new int[]{2, 3, 1, 1, 4};
        assertTrue(new JumpGame().canJump(input));
    }

    @Test
    void shouldReturnFalse() {
        int[] input = new int[]{3, 2, 1, 0, 4};
        assertFalse(new JumpGame().canJump(input));
    }

}