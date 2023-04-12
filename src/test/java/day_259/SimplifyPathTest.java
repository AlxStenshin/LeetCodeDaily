package day_259;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    @Test
    void shouldReturn_SlashHome() {
        String input = "/home/";
        String expected = "/home";

        assertEquals(expected, new SimplifyPath().simplifyPath(input));
    }

    @Test
    void shouldReturn_Slash() {
        String input = "/../";
        String expected = "/";

        assertEquals(expected, new SimplifyPath().simplifyPath(input));
    }

    @Test
    void shouldReturn_SlashHomeSlashFoo() {
        String input = "/home//foo/";
        String expected = "/home/foo";

        assertEquals(expected, new SimplifyPath().simplifyPath(input));
    }

    @Test
    void shouldReturn_SlashC() {
        String input = "/a/./b/../../c/";
        String expected = "/c";

        assertEquals(expected, new SimplifyPath().simplifyPath(input));
    }

    @Test
    void shouldReturn_SlashHome_Deque() {
        String input = "/home/";
        String expected = "/home";

        assertEquals(expected, new SimplifyPath().simplifyPath_Deque(input));
    }

    @Test
    void shouldReturn_Slash_Deque() {
        String input = "/../";
        String expected = "/";

        assertEquals(expected, new SimplifyPath().simplifyPath_Deque(input));
    }

    @Test
    void shouldReturn_SlashHomeSlashFoo_Deque() {
        String input = "/home//foo/";
        String expected = "/home/foo";

        assertEquals(expected, new SimplifyPath().simplifyPath_Deque(input));
    }

    @Test
    void shouldReturn_SlashC_Deque() {
        String input = "/a/./b/../../c/";
        String expected = "/c";

        assertEquals(expected, new SimplifyPath().simplifyPath_Deque(input));
    }

}