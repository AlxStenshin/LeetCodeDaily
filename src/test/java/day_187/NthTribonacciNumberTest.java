package day_187;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {

    @Test
    void shouldReturnFour() {
        assertEquals(4, new NthTribonacciNumber().tribonacci(4));
    }

    @Test
    void shouldReturn_1389537() {
        assertEquals(1389537, new NthTribonacciNumber().tribonacci(25));
    }

}