package day_226;

import utils.list.ListNode;

public class LinkedListRandomNodeReservoirSampling {
    private final ListNode head;

    public LinkedListRandomNodeReservoirSampling(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int scope = 1, chosenValue = 0;
        ListNode curr = this.head;
        while (curr != null) {
            // decide whether to include the element in reservoir
            if (Math.random() < 1.0 / scope) {
                chosenValue = curr.val;
            }
            // move on to the next node
            scope += 1;
            curr = curr.next;
        }
        return chosenValue;
    }
}
