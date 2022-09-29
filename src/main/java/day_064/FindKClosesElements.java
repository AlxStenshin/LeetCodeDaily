package day_064;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href=https://leetcode.com/problems/find-k-closest-elements/">
 *     658. Find K Closest Elements</a>
 * <p>
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
 * <p>
 * An integer a is closer to x than an integer b if:
 * <p>
 * |a - x| < |b - x|, or<p>
 * |a - x| == |b - x| and a < b
 */

public class FindKClosesElements {

    public List<Integer> findClosestElementsTwoPointers(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;

        while(right - left >= k) {

            // |a - x| < |b - x|
            int leftOffset = Math.abs(arr[left] - x);
            int rightOffset = Math.abs(arr[right] - x);

            if (leftOffset <= rightOffset) {
                right--;
            }
            else {
                left++;
            }
        }

        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList())
                .subList(left, right+1);
    }

    public List<Integer> findClosestElementsPriorityQueue(int[] arr, int k, int x) {
        // If second element of both arrays are different i.e. the values are different,
        // then sort them on the basis of their values only b[1] - a[1],
        // otherwise sort them on the basis of their keys a[0] - b[0].
        // In the above solution: a[0] and b[0] are index of elements in arr and a[1] and b[1] are Math.abs(x-arr[i]).
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] != a[1] ? b[1] - a[1] : a[0] - b[0]);

        for (int i = 0; i < arr.length; i++) {
            if (queue.size() == k) {
                assert queue.peek() != null;
                if (Math.abs(arr[i] - x) < queue.peek()[1]) {
                    queue.poll();
                    queue.add(new int[]{i, Math.abs(x - arr[i])});
                }
            } else {
                queue.add(new int[]{i, Math.abs(x - arr[i])});
            }
        }

        List<Integer> result = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            result.add(arr[Objects.requireNonNull(queue.poll())[0]]);
        }
        Collections.sort(result);
        return result;
    }
}
