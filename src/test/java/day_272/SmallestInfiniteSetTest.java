package day_272;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {

    @Test
    void shouldPerformCorrectBehavior() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(4, smallestInfiniteSet.popSmallest());
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }

}