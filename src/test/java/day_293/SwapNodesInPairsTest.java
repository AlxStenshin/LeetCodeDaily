package day_293;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    @Test
    void shouldReturnNodeTwoOneFourThree() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));

        assertEquals(expected, new SwapNodesInPairs().swapPairs(head));
    }

    @Test
    void shouldReturnEmptyNode() {
        ListNode head = new ListNode();
        ListNode expected = new ListNode();

        assertEquals(expected, new SwapNodesInPairs().swapPairs(head));
    }

    @Test
    void shouldReturnNodeOne() {
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);

        assertEquals(expected, new SwapNodesInPairs().swapPairs(head));
    }
}