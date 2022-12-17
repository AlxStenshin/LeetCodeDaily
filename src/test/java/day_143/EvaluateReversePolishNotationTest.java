package day_143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void shouldReturnNine() {
        String[] input = new String[]{"2","1","+","3","*"};
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    void shouldReturnSix() {
        String[] input = new String[]{"4","13","5","/","+"};
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    void shouldReturnTwentyTwo() {
        String[] input = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, new EvaluateReversePolishNotation().evalRPN(input));
    }

}