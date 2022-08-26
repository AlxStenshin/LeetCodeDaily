package day_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new BackspaceStringCompare().backspaceCompare("ab#c","ad#c"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new BackspaceStringCompare().backspaceCompare("a#c", "b"));
    }

    @Test
    void shouldReturnTrueWithOneBackspace() {
        assertTrue(new BackspaceStringCompare().backspaceCompare("xywrrmp", "xywrrmu#p"));
    }

}