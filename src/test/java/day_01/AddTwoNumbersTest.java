package day_01;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @Test
    void shouldReturn_708_Recursive() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode result = new AddTwoNumbers().addTwoNumbersRecursive(l1, l2);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_0_Recursive() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        ListNode result = new AddTwoNumbers().addTwoNumbersRecursive(l1, l2);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_89990001_Recursive() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        ListNode result = new AddTwoNumbers().addTwoNumbersRecursive(l1, l2);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_708_Iterative() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode result = new AddTwoNumbers().addTwoNumbersIterative(l1, l2);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_0_Iterative() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        ListNode result = new AddTwoNumbers().addTwoNumbersIterative(l1, l2);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_89990001_Iterative() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        ListNode result = new AddTwoNumbers().addTwoNumbersIterative(l1, l2);

        assertEquals(result, expected);
    }

}