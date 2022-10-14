package day_079;

import utils.list.ListNode;

/**
 * <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">
 *  2095. Delete the Middle Node of a Linked List</a>
 * <p>
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 * <p>
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
 * <p>
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */

public class DeleteTheMiddleNodeOfALInkedList {

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode prevSlowNode = head;

        while (fastNode != null && fastNode.next != null) {
            prevSlowNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        prevSlowNode.next = prevSlowNode.next.next;

        return head;
    }
}
