package day_114;

import org.junit.jupiter.api.Test;
import util.TimeSensitiveTest;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest extends TimeSensitiveTest {

    public UglyNumberTest() {
        this.setMaxAllowedTime(20);
    }

    @Test
    void shouldReturnTrueWithInputSix() {
        assertTrue(new UglyNumber().isUgly(6));
    }

    @Test
    void shouldReturnTrueWithInputOne() {
        assertTrue(new UglyNumber().isUgly(1));
    }

    @Test
    void shouldReturnTrueWithInputFourteen() {
        assertFalse(new UglyNumber().isUgly(14));
    }

    @Test
    void shouldReturnTrueWithInputSixRecursion() {
        assertTrue(new UglyNumber().isUgly(6));
    }

    @Test
    void shouldReturnTrueWithInputOneRecursion() {
        assertTrue(new UglyNumber().isUglyRecursion(1));
    }

    @Test
    void shouldReturnTrueWithInputFourteenRecursion() {
        assertFalse(new UglyNumber().isUglyRecursion(14));
    }

}