package day_079;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteTheMiddleNodeOfALInkedListTest {

    @Test
    void shouldRemoveNodeWithValueSeven() {
        ListNode input = new ListNode(1,new ListNode(3, new ListNode(4, new ListNode(7,
                new ListNode(1, new ListNode(2, new ListNode(6)))))));

        ListNode expected = new ListNode(1,new ListNode(3, new ListNode(4,
                new ListNode(1, new ListNode(2, new ListNode(6))))));

        ListNode result = new DeleteTheMiddleNodeOfALInkedList().deleteMiddle(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldRemoveNodeWithValueThree() {
        ListNode input = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4))));

        ListNode expected = new ListNode(1,new ListNode(2, new ListNode(4)));

        ListNode result = new DeleteTheMiddleNodeOfALInkedList().deleteMiddle(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldRemoveNodeWithValueOne() {
        ListNode input = new ListNode(2,new ListNode(1));

        ListNode expected = new ListNode(2);

        ListNode result = new DeleteTheMiddleNodeOfALInkedList().deleteMiddle(input);
        assertEquals(expected, result);
    }
}