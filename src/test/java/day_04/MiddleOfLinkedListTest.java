package day_04;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class MiddleOfLinkedListTest {

    @Test
    void shouldReturnHeadThree() {
        ListNode source = new ListNode(1, new ListNode( 2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        assertThat(new MiddleOfLinkedList().middleNode(source), samePropertyValuesAs(expected));
        assertThat(new MiddleOfLinkedList().middleNode_TwoPointers(source), samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnHeadFour() {
        ListNode source = new ListNode(1, new ListNode( 2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));

        assertThat(new MiddleOfLinkedList().middleNode(source), samePropertyValuesAs(expected));
        assertThat(new MiddleOfLinkedList().middleNode_TwoPointers(source), samePropertyValuesAs(expected));
    }
}