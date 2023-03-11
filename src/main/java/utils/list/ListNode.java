package utils.list;

import java.util.Objects;
import java.util.function.Predicate;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Will return the node with the given value or null (in case of node not found) */
    public ListNode filter(Predicate<ListNode> f) {
        ListNode node = this;
        while (node != null && !f.test(node)) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        return val + " > " + next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}