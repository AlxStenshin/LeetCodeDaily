package day_060;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    @Test
    void shouldPerformCorrectCircularBufferBehavior() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);

        assertTrue(myCircularQueue.enQueue(1));
        assertTrue(myCircularQueue.enQueue(2));
        assertTrue(myCircularQueue.enQueue(3));
        assertFalse(myCircularQueue.enQueue(4));
        assertEquals(3, myCircularQueue.Rear());
        assertTrue(myCircularQueue.isFull());
        assertTrue(myCircularQueue.deQueue());
        assertTrue(myCircularQueue.enQueue(4));
        assertEquals(4, myCircularQueue.Rear());
    }
}