package day_186;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LFUCacheTest {
    @Test
    void shouldPerformCorrectBehavior() {
        LFUCache lfu = new LFUCache(2);

        lfu.put(1, 1);
        lfu.put(2, 2);
        assertEquals(1, lfu.get(1));

        lfu.put(3, 3);
        assertEquals(-1, lfu.get(2));
        assertEquals(3, lfu.get(3));

        lfu.put(4, 4);
        assertEquals(-1, lfu.get(1));
        assertEquals(3, lfu.get(3));
        assertEquals(4, lfu.get(4));
    }

}