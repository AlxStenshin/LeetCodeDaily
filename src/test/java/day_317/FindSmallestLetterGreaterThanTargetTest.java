package day_317;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestLetterGreaterThanTargetTest {

    @Test
    void shouldReturn_c() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target));
    }

    @Test
    void shouldReturn_f() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        assertEquals('f', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target));

    }

    @Test
    void shouldReturn_x() {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';

        assertEquals('x', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target));

    }
}