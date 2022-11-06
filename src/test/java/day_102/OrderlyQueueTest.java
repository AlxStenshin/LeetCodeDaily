package day_102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderlyQueueTest {

    @Test
    void shouldReturn_acb() {
        assertEquals("acb", new OrderlyQueue().orderlyQueue("cba", 1));
    }

    @Test
    void shouldReturn_aaabc() {
        assertEquals("aaabc", new OrderlyQueue().orderlyQueue("baaca", 3));
    }
}