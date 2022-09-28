package day_063;

import utils.list.ListNode;

/**
 * <a href=https://leetcode.com/problems/remove-nth-node-from-end-of-list/">
 *     19. Remove Nth Node From End of List</a>
 * <p>
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // Fast pointer gets n-elements offset relative to slow one
        for (int i = 0; i < n; i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        // Target element reached if fast pointer is last element
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // just skipping target element
        slow.next = slow.next.next;
        return head;
    }
}
