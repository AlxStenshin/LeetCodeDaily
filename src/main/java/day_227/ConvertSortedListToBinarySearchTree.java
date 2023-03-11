package day_227;

import utils.list.ListNode;
import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">
 * 109. Convert Sorted List to Binary Search Tree </a>
 * <p>
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 */

public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST_ArrayConversion(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }

        return helper(arr, 0, arr.size()-1);
    }

    public TreeNode helper(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = helper(list, left, mid - 1);
        node.right = helper(list, mid + 1, right);
        return node;
    }

    public TreeNode sortedListToBST_TwoPointers(ListNode head) {
        if (head == null)
            return null;

        if (head.next == null)
            return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode res = new TreeNode(slow.next.val);
        ListNode rightSubTree = slow.next.next;
        slow.next = null;

        res.left = sortedListToBST_TwoPointers(head);
        res.right = sortedListToBST_TwoPointers(rightSubTree);

        return res;
    }
}
