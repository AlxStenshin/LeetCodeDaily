package day_226;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <a href = "https://leetcode.com/problems/linked-list-random-node/">
 * 382. Linked List Random Node </a>
 * <p>
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(ListNode head) Initializes the object with the head of the singly-linked list head.<br>
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
 */

class LinkedListRandomNodeReservoirSamplingTest {

    @Test
    void shouldPerformCorrectBehavior() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        LinkedListRandomNodeReservoirSampling linkedListRandomNode = new LinkedListRandomNodeReservoirSampling(head);
        List<Integer> values = List.of(1, 2, 3);

        for (int i = 0; i < 5; i++) {
            assertTrue(values.contains(linkedListRandomNode.getRandom()));
        }
    }

    @Test
    void shouldProvideEqualsChances() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        LinkedListRandomNodeReservoirSampling linkedListRandomNode = new LinkedListRandomNodeReservoirSampling(head);
        List<Integer> values = List.of(1, 2, 3);

        HashMap<Integer, Integer> result = new HashMap<>();

        int multiplier = 99;
        for (int i = 0; i < values.size()*multiplier; i++) {
            int val = linkedListRandomNode.getRandom();
            assertTrue(values.contains(val));

            result.put(val, result.getOrDefault(val, 0) + 1);
        }

        int availableDeviation = (int) (multiplier * 0.8);
        for (var entry : result.entrySet()) {
            assertTrue(entry.getValue() < multiplier + availableDeviation);
            assertTrue(entry.getValue() > multiplier - availableDeviation);
        }

        result.entrySet().forEach(System.out::println);
    }

}