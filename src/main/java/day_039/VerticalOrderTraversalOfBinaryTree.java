package day_039;

import utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 *
 * <a href="https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/">
 *      987. Vertical Order Traversal of a Binary Tree</a>
 * <p>
 * Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
 * <p>
 * For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
 * <p>
 * The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.
 * <p>
 * Return the vertical order traversal of the binary tree.
 */

public class VerticalOrderTraversalOfBinaryTree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // map of vertical level(v)
        // horizontal level(h)
        // all nodes at (v,h)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        vertical(root, map, 0, 0); // traverse in tree and fill the map

        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> vlevels : map.values()) {

            res.add(new ArrayList<>()); // add a new list
            for (PriorityQueue<Integer> hlevels : vlevels.values()) {

                // add all elements of hlevels pq in last added list
                while (!hlevels.isEmpty()) {
                    res.get(res.size() - 1).add(hlevels.poll());
                }
            }
        }
        return res;
    }

    void vertical(TreeNode root, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map, int vlevel, int hlevel) {

        if (root == null)
            return;

        // if vertcal level is not already present in map
        if (!map.containsKey(vlevel))
            map.put(vlevel, new TreeMap<>());

        // if horizontal level is not already present in map
        if (!map.get(vlevel).containsKey(hlevel))
            map.get(vlevel).put(hlevel, new PriorityQueue<>());

        // put current node in map
        map.get(vlevel).get(hlevel).add(root.val);

        /* call in left :
                  while calling in left
                            hlevel will increase by 1
                            vlevel will decrease by 1
        */
        vertical(root.left, map, vlevel - 1, hlevel + 1);

        /* call in right :
                  while calling in right
                            hlevel will increase by 1
                            vlevel will increase by 1
        */
        vertical(root.right, map, vlevel + 1, hlevel + 1);
    }
}
