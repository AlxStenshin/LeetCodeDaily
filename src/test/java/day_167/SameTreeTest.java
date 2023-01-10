package day_167;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    void shouldReturnTrueIfTreesAreSame() {
       TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
       TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

       assertTrue(new SameTree().isSameTree(p, q));
    }

    @Test
    void shouldReturnFalseWithMirroredTreesWithNulls() {
       TreeNode p = new TreeNode(1, new TreeNode(2), null);
       TreeNode q = new TreeNode(1, null, new TreeNode(3));

       assertFalse(new SameTree().isSameTree(p, q));
    }

    @Test
    void shouldReturnFalseWithMirroredTrees() {
       TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
       TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));

       assertFalse(new SameTree().isSameTree(p, q));
    }

}