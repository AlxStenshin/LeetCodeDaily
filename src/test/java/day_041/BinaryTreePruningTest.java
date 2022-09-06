package day_041;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class BinaryTreePruningTest {

    @Test
    void assertSimpleTreePruned() {
        TreeNode input = new TreeNode(1, null, new TreeNode(0, new TreeNode(0), new TreeNode(1)));
        TreeNode expected = new TreeNode(1, null, new TreeNode(0, null, new TreeNode(1)));

        assertThat(new BinaryTreePruning().pruneTree(input),
                samePropertyValuesAs(expected));
    }

}