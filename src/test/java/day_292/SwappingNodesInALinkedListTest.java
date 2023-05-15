package day_292;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SwappingNodesInALinkedListTest {

    @Test
    void shouldReturnOneFourThreeTwoFive() {
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;

        ListNode expected = new ListNode(1, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(5)))));

        assertEquals(expected, new SwappingNodesInALinkedList().swapNodes(head, k));
    }

    @Test
    void shouldReturnSevenNineSixSixEightSevenThreeZeroNineFive() {
        ListNode head = new ListNode(7, new ListNode(9,
                new ListNode(6, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(3,
                        new ListNode(0, new ListNode(9,new ListNode(5))))))))));
        int k = 5;

        ListNode expected = new ListNode(7, new ListNode(9,
                new ListNode(6, new ListNode(6, new ListNode(8, new ListNode(7, new ListNode(3,
                        new ListNode(0, new ListNode(9,new ListNode(5))))))))));

        assertEquals(expected, new SwappingNodesInALinkedList().swapNodes(head, k));
    }

}