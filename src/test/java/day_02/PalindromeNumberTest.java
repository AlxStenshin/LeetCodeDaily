package day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void shouldReturnTrue() {
        int x = 121;
        assertTrue(new PalindromeNumber().isPalindrome(x));
    }

    @Test
    void shouldReturnFalseWithNegativeNumber() {
        int x = -121;
        assertFalse(new PalindromeNumber().isPalindrome(x));
    }

    @Test
    void shouldReturnFalse() {
        int x = 10;
        assertFalse(new PalindromeNumber().isPalindrome(x));
    }

    @Test
    void shouldReturnTrueWithSymmetricNumber() {
        int x = 1001;
        assertTrue(new PalindromeNumber().isPalindrome(x));
    }

}