package day_131;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    @Test
    void shouldReturnNodeWithValueThree() {
        ListNode input = new ListNode(
                1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        assertEquals(expected, new MiddleOfTheLinkedList().middleNode(input));
    }

    @Test
    void shouldReturnNodeWithValueFour() {
        ListNode input = new ListNode(
                1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));

        assertEquals(expected, new MiddleOfTheLinkedList().middleNode(input));
    }

    @Test
    void shouldReturnNodeWithValueThreeSimplified() {
        ListNode input = new ListNode(
                1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        assertEquals(expected, new MiddleOfTheLinkedList().middleNodeSimplified(input));
    }

    @Test
    void shouldReturnNodeWithValueFourSimplified() {
        ListNode input = new ListNode(
                1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));

        assertEquals(expected, new MiddleOfTheLinkedList().middleNodeSimplified(input));
    }

}