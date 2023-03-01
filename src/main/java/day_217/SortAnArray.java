package day_217;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/sort-an-array/">
 * 912. Sort an Array </a>
 * <p>
 * Given an array of integers nums, sort the array in ascending order and return it.
 * <p>
 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 */

public class SortAnArray {

    /** Merge Sort Solution */
    public int[] sortArray_Merge(int[] nums) {
        int[] temporaryArray = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temporaryArray);
        return nums;
    }

    private void mergeSort(int[] arr, int left, int right, int[] tempArr) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        // Sort first and second halves recursively.
        mergeSort(arr, left, mid, tempArr);
        mergeSort(arr, mid + 1, right, tempArr);
        // Merge the sorted halves.
        merge(arr, left, mid, right, tempArr);
    }

    private void merge(int[] arr, int left, int mid, int right, int[] tempArr) {
        // Calculate the start and sizes of two halves.
        int secondStart = mid + 1;
        int firstSize = mid - left + 1;
        int secondSize = right - mid;

        // Copy elements of both halves into a temporary array.
        if (firstSize >= 0)
            System.arraycopy(arr, left, tempArr, left, firstSize);
        if (secondSize >= 0)
            System.arraycopy(arr, secondStart, tempArr, secondStart, secondSize);

        // Merge the sub-arrays 'in tempArray' back into the original array 'arr' in sorted order.
        int i = 0, j = 0, k = left;
        while (i < firstSize && j < secondSize) {
            if (tempArr[left + i] <= tempArr[secondStart + j]) {
                arr[k] = tempArr[left + i];
                i++;
            } else {
                arr[k] = tempArr[secondStart + j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < firstSize) {
            arr[k] = tempArr[left + i];
            i++;
            k++;
        }

        while (j < secondSize) {
            arr[k] = tempArr[secondStart + j];
            j++;
            k++;
        }
    }


    /** Heap Sort Solution */
    public int[] sortArray_Heap(int[] nums) {
        heapSort(nums);
        return nums;
    }

    private void heapSort(int[] arr) {
        int n = arr.length;
        // Build heap; heapify (top-down) all elements except leaf nodes.
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Traverse elements one by one, to move current root to end, and
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            // call max heapify on the reduced heap.
            heapify(arr, i, 0);
        }
    }

    // Function to heapify a subtree (in top-down order) rooted at index i.
    private void heapify(int[] arr, int n, int i) {
        // Initialize largest as root 'i'.
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root.
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far.
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root swap root with largest element
        // Recursively heapify the affected sub-tree (i.e. move down).
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    /** Counting Sort Solution */
    public int[] sortArray_Counting(int[] nums) {
        countingSort(nums);
        return nums;
    }

    private void countingSort(int[] arr) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        int minVal = arr[0];
        int maxVal = arr[0];

        // Find the minimum and maximum values in the array,
        // and update it's count in the hash map.
        for (int j : arr) {
            minVal = Math.min(minVal, j);
            maxVal = Math.max(maxVal, j);
            counts.put(j, counts.getOrDefault(j, 0) + 1);
        }

        int index = 0;
        // Place each element in its correct position in the array.
        for (int val = minVal; val <= maxVal; ++val) {
            // Append all 'val's together if they exist.
            while (counts.getOrDefault(val, 0) > 0) {
                arr[index] = val;
                index += 1;
                counts.put(val, counts.get(val) - 1);
            }
        }
    }

    /** Radix Sort Solution */
    public int[] sortArray_Radix(int[] nums) {
        radixSort(nums);
        return nums;
    }

    // Radix sort function.
    private void radixSort(int[] arr) {

        // Find the absolute maximum element to find max number of digits.
        int maxElement = arr[0];
        for (int val : arr) {
            maxElement = Math.max(Math.abs(val), maxElement);
        }

        int maxDigits = 0;
        while (maxElement > 0) {
            maxDigits += 1;
            maxElement /= 10;
        }

        // Radix sort, least significant digit place to most significant.
        int placeValue = 1;
        for (int digit = 0; digit < maxDigits; ++digit) {
            bucketSort(arr, placeValue);
            placeValue *= 10;
        }

        // Seperate out negatives and reverse them.
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        for (int val : arr) {
            if (val < 0) {
                negatives.add(val);
            } else {
                positives.add(val);
            }
        }
        Collections.reverse(negatives);

        // Final 'answer' will be 'negative' elements, then 'positive' elements.
        int index = 0;
        for (int val : negatives) {
            arr[index] = val;
            index++;
        }
        for (int val : positives) {
            arr[index] = val;
            index++;
        }
    }

    // Bucket sort function for each place value digit.
    private void bucketSort(int[] arr, int placeValue) {
        ArrayList<List<Integer>> buckets = new ArrayList<>(10);
        for (int digit = 0; digit < 10; ++digit) {
            buckets.add(digit, new ArrayList<>());
        }

        // Store the respective number based on its digit.
        for (int val : arr) {
            int digit = Math.abs(val) / placeValue;
            digit = digit % 10;
            buckets.get(digit).add(val);
        }

        // Overwrite 'arr' in sorted order of current place digits.
        int index = 0;
        for (int digit = 0; digit < 10; ++digit) {
            for (int val : buckets.get(digit)) {
                arr[index] = val;
                index++;
            }
        }
    }

}
