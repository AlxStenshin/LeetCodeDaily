package day_274;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulbSwitcherTest {

    @Test
    void shouldReturnOneWithInputThreee() {
        int n = 3;
        assertEquals(1, new BulbSwitcher().bulbSwitch(n));
    }

    @Test
    void shouldReturnOneWithInputOne() {
        int n = 1;
        assertEquals(1, new BulbSwitcher().bulbSwitch(n));
    }

    @Test
    void shouldReturnZeroWithInputZero() {
        int n = 0;
        assertEquals(0, new BulbSwitcher().bulbSwitch(n));
    }

}