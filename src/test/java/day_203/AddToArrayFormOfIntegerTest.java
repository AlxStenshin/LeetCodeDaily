package day_203;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddToArrayFormOfIntegerTest {

    @Test
    void shouldReturnListOf_1234() {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> expected = List.of(1, 2, 3, 4);

        assertEquals(expected, new AddToArrayFormOfInteger().addToArrayForm(num, k));
    }

    @Test
    void shouldReturnListOf_455() {
        int[] num = {2, 7, 4};
        int k = 181;
        List<Integer> expected = List.of(4, 5, 5);

        assertEquals(expected, new AddToArrayFormOfInteger().addToArrayForm(num, k));
    }

    @Test
    void shouldReturnListOf_1021() {
        int[] num = {2, 1, 5};
        int k = 806;
        List<Integer> expected = List.of(1, 0, 2, 1);

        assertEquals(expected, new AddToArrayFormOfInteger().addToArrayForm(num, k));
    }

}