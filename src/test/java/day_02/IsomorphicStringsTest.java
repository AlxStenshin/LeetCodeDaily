package day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void shouldReturnTrueOn_egg_add_Input() {
        assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    void shouldReturnFalseOn_foo_bar_Input() {
        assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    void shouldReturnTrueOn_paper_title_Input() {
        assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}