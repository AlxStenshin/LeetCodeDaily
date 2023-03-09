package day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void shouldReturnTrueWithSimpleInput() {
        String s = "()";
        assertTrue(new ValidParentheses().isValid(s));
    }

    @Test
    void shouldReturnTrueWithSequenceOfSimpleParentheses() {
        String s = "()[]{}";
        assertTrue(new ValidParentheses().isValid(s));
    }

    @Test
    void shouldReturnFalse() {
        String s = "(]";
        assertFalse(new ValidParentheses().isValid(s));
    }

    @Test
    void shouldReturnTrueWithComplexInput() {
        String s = "([[]]){}";
        assertTrue(new ValidParentheses().isValid(s));
    }

}