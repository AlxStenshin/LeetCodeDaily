package day_03;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class MergeTwoSortedListsTest {

    @Test
    void shouldReturnSecondListIfFirstIsEmpty() {
        ListNode expected = new ListNode(0);
        assertThat(new MergeTwoSortedLists().mergeTwoLists(
                new ListNode(),expected),
                samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnEmptyNode() {
        ListNode expected = new ListNode();
        assertThat(new MergeTwoSortedLists().mergeTwoLists(
                new ListNode(), new ListNode()),
                samePropertyValuesAs(expected));
    }

    @Test
    void shouldReturnCorrectValue() {
        ListNode expected = new ListNode(1,
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(4,
                new ListNode()))))));
        assertThat(new MergeTwoSortedLists().mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))),
                samePropertyValuesAs(expected));
    }

}