package day_292;

import utils.list.ListNode;

/**
 * <a href = "https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/" >
 * 1721. Swapping Nodes in a Linked List </a>
 * <p>
 * You are given the head of a linked list, and an integer k.
 * <p>
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
 */

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode rigth = head;

        for (int i = 1; i < k; i++)
            left = left.next;

        ListNode curr = left;
        while (curr.next != null) {
            curr = curr.next;
            rigth = rigth.next;
        }

        int swapVal = left.val;
        left.val = rigth.val;
        rigth.val = swapVal;
        return head;
    }
}
