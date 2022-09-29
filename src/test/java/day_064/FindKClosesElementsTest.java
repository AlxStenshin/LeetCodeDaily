package day_064;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindKClosesElementsTest {

    private final int[] input = new int[]{1, 2, 3, 4, 5};
    private final List<Integer> expected = List.of(1, 2, 3, 4);

    @Test
    void shouldReturnExpectedValuesWith3() {
        assertEquals(expected, new FindKClosesElements().findClosestElementsTwoPointers(input, 4, 3));
        assertEquals(expected, new FindKClosesElements().findClosestElementsPriorityQueue(input, 4, 3));
    }

    @Test
    void shouldReturnExpectedValuesWithMinusOne() {
        assertEquals(expected, new FindKClosesElements().findClosestElementsTwoPointers(input, 4, -1));
        assertEquals(expected, new FindKClosesElements().findClosestElementsPriorityQueue(input, 4, -1));
    }
}