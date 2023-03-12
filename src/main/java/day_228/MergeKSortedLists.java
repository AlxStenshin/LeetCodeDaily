package day_228;

import utils.list.ListNode;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/merge-k-sorted-lists/">
 * 23. Merge k Sorted Lists </a>
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 */

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> allValues = new ArrayList<>();

        for (ListNode node : lists) {
            while (node != null) {
                allValues.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(allValues);

        ListNode head = new ListNode(0);
        ListNode h = head;
        for (int i : allValues) {
            h.next = new ListNode(i);
            h = h.next;
        }

        h.next = null;
        return head.next;
    }

    public ListNode mergeKLists_Compare(ListNode[] lists) {
        int min_index = 0;
        ListNode head = new ListNode(0);
        ListNode h = head;

        while (true) {
            boolean enought = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < min) {
                        min_index = i;
                        min = lists[i].val;
                    }
                    enought = false;
                }
            }
            if (enought) break;

            h.next = new ListNode(lists[min_index].val);
            h = h.next;
            lists[min_index] = lists[min_index].next;
        }

        h.next = null;
        return head.next;
    }


    public ListNode mergeKLists_PQ(ListNode[] lists) {
        Comparator<ListNode> cmp;
        cmp = Comparator.comparingInt(o -> o.val);

        Queue<ListNode> queue = new PriorityQueue<>(cmp);
        for (ListNode l : lists) {
            if (l != null) {
                queue.add(l);
            }
        }

        ListNode head = new ListNode(0);
        ListNode point = head;
        while (!queue.isEmpty()) {
            point.next = queue.poll();
            point = point.next;
            ListNode next = point.next;
            if (next != null) {
                queue.add(next);
            }
        }
        return head.next;
    }

    public ListNode mergeKLists_Divide_and_Conquer(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i = i + interval * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode ans = h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                h.next = l1;
                h = h.next;
                l1 = l1.next;
            } else {
                h.next = l2;
                h = h.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            h.next = l2;
        }
        if (l2 == null) {
            h.next = l1;
        }
        return ans.next;
    }

}
