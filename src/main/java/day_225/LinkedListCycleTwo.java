package day_225;

import utils.list.ListNode;

import java.util.HashSet;
import java.util.Set;

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
