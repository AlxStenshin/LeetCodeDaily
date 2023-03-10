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

public class LinkedListRandomNode {

    private final ListNode head;
    private ListNode node;
    private final java.util.Random random = new java.util.Random();
    private final int size;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.node = head;
        this.size = getListSize(head);
    }

    public int getRandom() {
        int offset = random.nextInt(size);
        for (int i = 0; i < offset; i++) {
            if (node == null) {
                node = head;
            }
            node = node.next;
        }
        return node == null ? head.val : node.val;
    }

    private int getListSize(ListNode head) {
        int size = head != null ? 1: 0;
        while (head.next != null) {
            head = head.next;
            size++;
        }

        return size;
    }
}
