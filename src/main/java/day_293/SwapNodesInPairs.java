package day_293;

import utils.list.ListNode;

/**
 * <a href = "https://leetcode.com/problems/swap-nodes-in-pairs/" >
 * 24. Swap Nodes in Pairs </a>
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 */

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode curr = ans;

        while (curr.next != null && curr.next.next != null) {
            ListNode t1 = curr.next;
            ListNode t2 = curr.next.next;
            curr.next = t2;
            t1.next = t2.next;
            t2.next = t1;
            curr = curr.next.next;
        }
        return ans.next;
    }
}
