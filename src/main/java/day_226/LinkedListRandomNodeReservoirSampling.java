package day_226;

import utils.list.ListNode;

/**
 * <a href = "https://leetcode.com/problems/linked-list-random-node/">
 * 382. Linked List Random Node </a>
 * <p>
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(ListNode head) Initializes the object with the head of the singly-linked list head.<br>
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
 */

public class LinkedListRandomNodeReservoirSampling {
    private final ListNode head;

    public LinkedListRandomNodeReservoirSampling(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int scope = 1, chosenValue = 0;
        ListNode curr = this.head;
        while (curr != null) {
            // decide whether to include the element in reservoir
            if (Math.random() < 1.0 / scope) {
                chosenValue = curr.val;
            }
            // move on to the next node
            scope += 1;
            curr = curr.next;
        }
        return chosenValue;
    }
}
