package day_225;

import utils.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href = "https://leetcode.com/problems/linked-list-cycle-ii/">
 * 142. Linked List Cycle II </a>
 * <p>
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 */

public class LinkedListCycleTwo {

    public ListNode detectCycleTwoPointers(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (fastNode == slowNode) {
                slowNode = head;

                while (slowNode != fastNode) {
                    fastNode = fastNode.next;
                    slowNode = slowNode.next;
                }
                return slowNode;
            }
        }
        return null;
    }


    public ListNode detectCycleBruteForce(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();

        while (head != null) {
            if (!nodeSet.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

}
