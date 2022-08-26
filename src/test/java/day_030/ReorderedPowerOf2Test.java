package day_030;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderedPowerOf2Test {

    @Test
    void shouldReturnTrue() {
        assertTrue(new ReorderedPowerOf2().reorderedPowerOf2(1));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new ReorderedPowerOf2().reorderedPowerOf2(10));
    }

    @Test
    void shouldReturnTrueWithSomeBigNumber() {
        assertTrue(new ReorderedPowerOf2().reorderedPowerOf2(5792021));
    }
}