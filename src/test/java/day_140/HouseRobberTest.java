package day_140;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void shouldReturnFour() {
        int[] input = new int[]{1, 2, 3, 1};
        assertEquals(4, new HouseRobber().rob(input));
    }

    @Test
    void shouldReturnTwelve() {
        int[] input = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, new HouseRobber().rob(input));
    }
}