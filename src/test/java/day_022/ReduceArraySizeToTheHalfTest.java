package day_022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceArraySizeToTheHalfTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new ReduceArraySizeToTheHalf().minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new ReduceArraySizeToTheHalf().minSetSize(new int[]{7, 7, 7, 7, 7, 7}));
    }

}