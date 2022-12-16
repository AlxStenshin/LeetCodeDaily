package day_142;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    void shouldPerformCorrectBehavior() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertFalse(myQueue.empty());
    }
}