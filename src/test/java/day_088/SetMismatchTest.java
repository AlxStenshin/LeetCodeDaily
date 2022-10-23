package day_088;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMismatchTest {

    @Test
    void shouldReturnTwoAndThree() {
        assertArrayEquals(new int[]{2, 3}, new SetMismatch().findErrorNums(new int[]{1, 2, 2, 4}));
    }

    @Test
    void shouldReturnOneAndTwo() {
        assertArrayEquals(new int[]{1, 2}, new SetMismatch().findErrorNums(new int[]{1, 1}));
    }

    @Test
    void shouldReturnTwoAndOne() {
        assertArrayEquals(new int[]{2, 1}, new SetMismatch().findErrorNums(new int[]{2, 2}));

    }
}