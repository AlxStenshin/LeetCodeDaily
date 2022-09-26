package day_061;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsTest {

    @Test
    void shouldReturnFalse() {
        String[] input = new String[]{"a==b", "b!=a"};
        assertFalse(new SatisfiabilityOfEqualityEquations().equationsPossible(input));
    }

    @Test
    void shouldReturnTrue() {
        String[] input = new String[]{"a==b", "b==a"};
        assertTrue(new SatisfiabilityOfEqualityEquations().equationsPossible(input));
    }

    @Test
    void shouldReturnFalseWithComplexEquations() {
        String[] input = new String[]{"a==b", "b!=c", "c==a"};
        assertFalse(new SatisfiabilityOfEqualityEquations().equationsPossible(input));
    }

}