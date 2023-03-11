package day_227;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedListToBinarySearchTreeTest {

    @Test
    void shouldReturnTwoBranchesBinaryTree() {
        ListNode head =  new ListNode(-10, new ListNode(-3,
                new ListNode(0,
                        new ListNode(5, new ListNode(9)))));

        TreeNode expected = new TreeNode(0,
                new TreeNode(-3, new TreeNode(-10), null),
                new TreeNode(9, new TreeNode(5), null));

        TreeNode result = new ConvertSortedListToBinarySearchTree().sortedListToBST_TwoPointers(head);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyTree() {
        ListNode head =  new ListNode();
        TreeNode expected = new TreeNode();

        assertEquals(expected, new ConvertSortedListToBinarySearchTree().sortedListToBST_TwoPointers(head));
    }

    @Test
    void shouldReturnEmptyTree_Array() {
        ListNode head =  new ListNode();
        TreeNode expected = new TreeNode();

        assertEquals(expected, new ConvertSortedListToBinarySearchTree().sortedListToBST_ArrayConversion(head));
    }

}