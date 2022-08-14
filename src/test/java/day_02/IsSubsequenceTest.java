package day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }
}