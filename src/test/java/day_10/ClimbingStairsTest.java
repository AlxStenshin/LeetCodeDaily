package day_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new ClimbingStairs().climbStairs(1));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }

    @Test
    void shouldReturnFour() {
        assertEquals(5, new ClimbingStairs().climbStairs(4));
    }

}