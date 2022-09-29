package day_063;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void shouldRemove4() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));

        assertEquals(expected, new RemoveNthNodeFromEndOfList().removeNthFromEnd(input, 2));

    }

    @Test
    void shouldRemoveTheOnlyElement() {
        ListNode input = new ListNode(1);

        assertNull(new RemoveNthNodeFromEndOfList().removeNthFromEnd(input, 1));
    }

    @Test
    void shouldRemoveFirst() {
        ListNode input = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(1);

        assertEquals(expected, new RemoveNthNodeFromEndOfList().removeNthFromEnd(input, 1));
    }
}