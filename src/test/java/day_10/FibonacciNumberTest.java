package day_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    void shouldReturnOne() {
        assertEquals(1, new FibonacciNumber().fib(2));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new FibonacciNumber().fib(3));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new FibonacciNumber().fib(4));
    }

}