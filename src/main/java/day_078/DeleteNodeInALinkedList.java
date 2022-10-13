package day_078;

import utils.list.ListNode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">
 *  237. Delete Node in a Linked List</a>
 * <p>
 * here is a singly-linked list head and we want to delete a node node in it.
 * <p>
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 * <p>
 * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
 * <p>
 * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 * <p>
 * The value of the given node should not exist in the linked list.
 * The number of nodes in the linked list should decrease by one.
 * All the values before node should be in the same order.
 * All the values after node should be in the same order.
 */

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
