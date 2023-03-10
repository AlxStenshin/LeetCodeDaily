package day_226;

import org.junit.jupiter.api.Test;
import utils.list.ListNode;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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