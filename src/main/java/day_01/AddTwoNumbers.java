package day_01;

import utils.list.ListNode;

public class AddTwoNumbers {
    int carry = 0;

    public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        int sum = val1 + val2 + carry;
        carry = sum / 10;

        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;

        return new ListNode(sum % 10, addTwoNumbersRecursive(l1, l2));
    }

    public ListNode addTwoNumbersIterative(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
}
