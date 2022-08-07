package day_011;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsPermutationTest {

    @Test
    void shouldReturnFive() {
        //Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
        assertEquals(5, new CountVowelsPermutation().countVowelPermutation(1));
    }

    @Test
    void shouldReturnTen() {
        //"ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
        assertEquals(10, new CountVowelsPermutation().countVowelPermutation(2));
    }

    @Test
    void shouldReturnSixtyEight() {
        assertEquals(68, new CountVowelsPermutation().countVowelPermutation(5));
    }

}