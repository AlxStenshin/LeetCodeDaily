package day_138;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }

}