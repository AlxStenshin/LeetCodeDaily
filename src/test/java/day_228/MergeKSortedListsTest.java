package day_228;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    @Test
    void shouldCorrectlyMergeLists() {
        ListNode[] nodes = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        assertEquals(expected, new MergeKSortedLists().mergeKLists(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyArray() {
        ListNode[] nodes = {};
        assertNull(new MergeKSortedLists().mergeKLists(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyNode() {
        ListNode[] nodes = {new ListNode()};
        ListNode expected = new ListNode();
        assertEquals(expected, new MergeKSortedLists().mergeKLists(nodes));
    }

    @Test
    void shouldCorrectlyMergeLists_Compare() {
        ListNode[] nodes = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        assertEquals(expected, new MergeKSortedLists().mergeKLists_Compare(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyArray_Compare() {
        ListNode[] nodes = {};
        assertNull(new MergeKSortedLists().mergeKLists_Compare(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyNode_Compare() {
        ListNode[] nodes = {new ListNode()};
        ListNode expected = new ListNode();
        assertEquals(expected, new MergeKSortedLists().mergeKLists_Compare(nodes));
    }

    @Test
    void shouldCorrectlyMergeLists_PQ() {
        ListNode[] nodes = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        assertEquals(expected, new MergeKSortedLists().mergeKLists_PQ(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyArray_PQ() {
        ListNode[] nodes = {};
        assertNull(new MergeKSortedLists().mergeKLists_PQ(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyNode_PQ() {
        ListNode[] nodes = {new ListNode()};
        ListNode expected = new ListNode();
        assertEquals(expected, new MergeKSortedLists().mergeKLists_PQ(nodes));
    }


    @Test
    void shouldCorrectlyMergeLists_DC() {
        ListNode[] nodes = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        assertEquals(expected, new MergeKSortedLists().mergeKLists_Divide_and_Conquer(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyArray_DC() {
        ListNode[] nodes = {};
        assertNull(new MergeKSortedLists().mergeKLists_Divide_and_Conquer(nodes));
    }

    @Test
    void shouldReturnEmptyNodeWithEmptyNode_DC() {
        ListNode[] nodes = {new ListNode()};
        ListNode expected = new ListNode();
        assertEquals(expected, new MergeKSortedLists().mergeKLists_Divide_and_Conquer(nodes));
    }

}