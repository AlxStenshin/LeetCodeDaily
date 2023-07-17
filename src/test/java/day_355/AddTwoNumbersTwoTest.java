package day_355;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;


import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTwoTest {

    @Test
    void shouldReturnListOfSevenEightZeroSeven() {
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(7))));

        assertEquals(expected, new AddTwoNumbersTwo().addTwoNumbers(l1, l2));
    }

    @Test
    void shouldReturnListOEightZeroSeven() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(8, new ListNode(0, new ListNode(7)));

        assertEquals(expected, new AddTwoNumbersTwo().addTwoNumbers(l1, l2));
    }

    @Test
    void shouldReturnListOfZero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        assertEquals(expected, new AddTwoNumbersTwo().addTwoNumbers(l1, l2));
    }

}