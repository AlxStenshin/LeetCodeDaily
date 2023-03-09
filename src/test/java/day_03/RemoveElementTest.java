package day_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    void shouldReturnTwo() {
        int[] input = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, new RemoveElement().removeElement(input, val));
    }

    @Test
    void shouldReturnFive() {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        assertEquals(5, new RemoveElement().removeElement(input, val));
    }

    @Test
    void shouldReturnInput() {
        int[] input = {2};
        int val = 3;
        assertEquals(1, new RemoveElement().removeElement(input, val));
    }

}