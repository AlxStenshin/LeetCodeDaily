package day_04;

import utils.list.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */

public class MiddleOfLinkedList {

    ListNode middleNode_TwoPointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int middle = length / 2;
        temp = head;
        while (middle != 0) {
            temp = temp.next;
            middle--;
        }
        return temp;
    }
}
