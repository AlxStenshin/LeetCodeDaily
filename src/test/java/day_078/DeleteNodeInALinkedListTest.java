package day_078;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;


import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInALinkedListTest {

    @Test
    void shouldRemoveNodeFive() {
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(1, new ListNode(9)));
        new DeleteNodeInALinkedList().deleteNode(head.filter(x -> x.val == 5));
        assertEquals(expected, head);
    }


    @Test
    void shouldRemoveNodeOne() {
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(9)));
        new DeleteNodeInALinkedList().deleteNode(head.filter(x -> x.val == 1));
        assertEquals(expected, head);
    }
}