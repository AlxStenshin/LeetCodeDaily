package day_294;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumOfALinkedListTest {

    @Test
    void shouldReturnSix() {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        int expected = 6;
        assertEquals(expected, new MaximumTwinSumOfALinkedList().pairSum(head));
    }

    @Test
    void shouldReturnSeven() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        int expected = 7;
        assertEquals(expected, new MaximumTwinSumOfALinkedList().pairSum(head));
    }

    @Test
    void shouldReturn_100001() {
        ListNode head = new ListNode(1, new ListNode(100000));
        int expected = 100001;
        assertEquals(expected, new MaximumTwinSumOfALinkedList().pairSum(head));
    }

}