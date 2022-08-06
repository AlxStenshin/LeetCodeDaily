package day_010;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoorPigsTest {

    @Test
    void shouldReturnFive() {
        assertEquals(5, new PoorPigs().poorPigs(1000, 15, 60));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, new PoorPigs().poorPigs(4, 15, 15));
    }

    @Test
    void shouldReturnTwoToo() {
        assertEquals(2, new PoorPigs().poorPigs(4, 15, 30));
    }
}