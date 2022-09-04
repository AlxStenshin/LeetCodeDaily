package day_039;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class VerticalOrderTraversalOfBinaryTreeTest {

    @Test
    void shouldReturnCorrectValues(){
        //Input: root = [3,9,20,null,null,15,7]
        //Output: [[9],[3,15],[20],[7]]

        TreeNode input = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> expected = List.of(
                List.of(9),
                List.of(3,15),
                List.of(20),
                List.of(7));

        assertThat(expected).hasSameElementsAs(new VerticalOrderTraversalOfBinaryTree().verticalTraversal(input));
    }
}