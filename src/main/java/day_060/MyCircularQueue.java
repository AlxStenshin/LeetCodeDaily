package day_060;

/**
 * <a href=https://leetcode.com/problems/design-circular-queue/">
 *     622. Design Circular Queue</a>
 * <p>
 * Design your implementation of the circular queue.
 * The circular queue is a linear data structure in which the operations are performed based on FIFO
 * (First In First Out) principle and the last position is connected back to the first position to make a circle.
 * It is also called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 * In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue.
 * But using the circular queue, we can use the space to store new values.
 * <p>
 * You must solve the problem without using the built-in queue data structure in your programming language.
 */

public class MyCircularQueue {

    private final int[] circularBuffer;
    private int frontIndex;
    private int tailIndex;
    private final int capacity;

    /**
     * @param k the size of the queue to be initialize.
     */
    public MyCircularQueue(int k) {
        capacity = k;
        circularBuffer = new int[capacity];
        frontIndex = -1;
        tailIndex = -1;
    }

    /**
     * Inserts an element into the circular queue.
     *
     * @param value element to insert
     * @return true if the operation is successful
     */
    public boolean enQueue(int value) {
        if (isFull())
            return false;

        if (frontIndex == -1) {
            frontIndex = 0;
            tailIndex = 0;
            circularBuffer[tailIndex] = value;
            return true;
        }

        tailIndex = nextIndex(tailIndex);
        circularBuffer[tailIndex] = value;
        return true;
    }

    /**
     * Deletes an element from the circular queue.
     * @return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty())
            return false;

        if (frontIndex == tailIndex) {
            frontIndex = -1;
            tailIndex = -1;
            return true;
        }

        frontIndex = nextIndex(frontIndex);
        return true;
    }

    /**
     * @return The front item from the queue. -1 if the queue is empty
     */
    public int Front() {
        if (frontIndex == -1)
            return -1;

        return circularBuffer[frontIndex];
    }

    /**
     * @return the last item from the queue. If the queue is empty, return -1.
     */
    public int Rear() {
        if (tailIndex == -1)
            return -1;

        return circularBuffer[tailIndex];
    }

    /**
     * @return The circular queue is empty or not.
     */
    public boolean isEmpty() {
        return frontIndex == -1;
    }

    /**
     * @return The circular queue is full or not.
     */
    public boolean isFull() {
        return frontIndex != -1 && nextIndex(tailIndex) == frontIndex;
    }

    private int nextIndex(int index) {
        return (index + 1) % capacity;
    }

    private int prevIndex(int index) {
        return (index + capacity - 1) % capacity;
    }
}