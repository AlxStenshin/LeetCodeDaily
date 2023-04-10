package day_257;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void shouldReturnTrueWithSingleRegularParentheses() {
        String input = "()";
        assertTrue(new ValidParentheses().isValid(input));
    }

    @Test
    void shouldReturnTrueWithSeriesOfParentheses() {
        String input = "()[]{}";
        assertTrue(new ValidParentheses().isValid(input));
    }

    @Test
    void shouldReturnFalseWithDifferentParentheses() {
        String input = "(]";
        assertFalse(new ValidParentheses().isValid(input));
    }

}