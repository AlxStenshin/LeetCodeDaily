package day_131;

import utils.list.ListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">
 *  876. Middle of the Linked List </a>
 * <p>
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 */

public class MiddleOfTheLinkedList {

    public ListNode middleNodeSimplified(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        int fastPointer = 1;
        while (head.next != null) {
            head = head.next;
            fastPointer++;
            if (fastPointer % 2 == 0) {
                middleNode = middleNode.next;
            }
        }
        return middleNode;
    }
}
