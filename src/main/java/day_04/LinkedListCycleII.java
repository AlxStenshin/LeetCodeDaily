package day_04;

import utils.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. Linked List Cycle II
 * https://leetcode.com/problems/linked-list-cycle-ii/
 *
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 */

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {

        Set<ListNode> nodes = new HashSet<>();
        ListNode current = head;

        while (current != null) {
            if (nodes.contains(current))
                return current;

            nodes.add(current);
            current = current.next;
        }

        return null;
    }
}
