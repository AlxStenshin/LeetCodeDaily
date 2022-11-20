package day_116;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new BasicCalculator().calculate("1+1"));
    }

    @Test
    void shouldReturnThree() {
        assertEquals(3, new BasicCalculator().calculate(" 2-1 + 2 "));
    }

    @Test
    void shouldReturnTwentyThree() {
        assertEquals(23, new BasicCalculator().calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}