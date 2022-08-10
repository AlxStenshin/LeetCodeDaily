package day_014;

import day_014.ConvertSortedArrayToBinarySearchTree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;


class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    void shouldReturnHeightBalancedBinaryTree() {
        TreeNode expected = new TreeNode(0, new TreeNode(3), new TreeNode(1));
        assertThat(new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{1, 3}),
                samePropertyValuesAs(expected));

    }

    @Test
    void shouldReturnComplexHeightBalancedBinaryTree() {
        TreeNode expected = new TreeNode(0, new TreeNode(3), new TreeNode(1));
        assertThat(new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}),
                samePropertyValuesAs(expected));
    }
}