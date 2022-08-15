package day_03;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class ReverseLinkedListTest {

    @Test
    void shouldReturnEmptyNodeWithEmptyInput() {
        ListNode expected = new ListNode();
        assertThat(new ReverseLinkedList().reverseList(
                new ListNode()), samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnReversedList() {
        ListNode expected = new ListNode(2, new ListNode(1));
        assertThat(new ReverseLinkedList().reverseList(
                new ListNode(1, new ListNode(2))),
                samePropertyValuesAs(expected));
    }
}