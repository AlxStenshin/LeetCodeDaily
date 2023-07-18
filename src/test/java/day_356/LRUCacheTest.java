package day_356;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void shouldPerformCorrectBehavior() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        assertEquals(1, lRUCache.get(1));
        lRUCache.put(3, 3);
        assertEquals(-1, lRUCache.get(2));
        lRUCache.put(4, 4);
        assertEquals(-1, lRUCache.get(1));
        assertEquals(3, lRUCache.get(3));
        assertEquals(4, lRUCache.get(4));
    }
}