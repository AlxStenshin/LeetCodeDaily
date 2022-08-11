package day_014;

import utils.tree.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * <p>
 * Given an integer array nums where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 * <p>
 * A height-balanced binary tree is a binary tree in which the depth
 * of the two subtrees of every node never differs by more than one.
 */

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode createTreeNode(int[] nums, int l, int r) {
        if (l > r)
            return null;

        if (l == r)
            return new TreeNode(nums[l]);

        int mid = (l + r) / 2;
        return new TreeNode(nums[mid],
                createTreeNode(nums, l, mid - 1),
                createTreeNode(nums, mid + 1, r));
    }
}


