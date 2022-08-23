package day_027;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(new PalindromeLinkedList().isPalindrome(
                new ListNode(1, new ListNode(2, new ListNode( 2, new ListNode(1))))));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(new PalindromeLinkedList().isPalindrome(
                new ListNode(1, new ListNode(2))));
    }

}