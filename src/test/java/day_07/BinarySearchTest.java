package day_07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldReturnFourForInputNine() {
        assertEquals(4, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void shouldReturnNoneForInputTwo() {
        assertEquals(-1, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

}