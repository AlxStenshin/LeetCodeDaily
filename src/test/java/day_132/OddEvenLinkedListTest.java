package day_132;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

    @Test
    void shouldPlaceNodeElementsTwoFourAtTheEnd() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5,
                new ListNode(2, new ListNode(4)))));

        assertEquals(expected, new OddEvenLinkedList().oddEvenList(input));
    }

    @Test
    void shouldPlaceNodeElementsOneFiveFourAtTheEnd() {
        ListNode input = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5,
                new ListNode(6, new ListNode(4, new ListNode(7)))))));
        ListNode expected = new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7,
                new ListNode(1, new ListNode(5, new ListNode(4)))))));

        assertEquals(expected, new OddEvenLinkedList().oddEvenList(input));
    }



}