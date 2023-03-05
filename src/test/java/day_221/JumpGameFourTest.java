package day_221;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameFourTest {

    @Test
    void shouldReturnThree() {
        int[] input = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        assertEquals(3, new JumpGameFour().minJumps(input));
    }

    @Test
    void shouldReturnZero() {
        int[] input = {7};
        assertEquals(0, new JumpGameFour().minJumps(input));
    }

    @Test
    void shouldReturnOne() {
        int[] input = {7, 6, 9, 6, 9, 6, 9, 7};
        assertEquals(1, new JumpGameFour().minJumps(input));
    }

}