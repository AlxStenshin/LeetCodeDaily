package day_070;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class AddOneTowToTreeTest {

    @Test
    void shouldInsertSecondRow() {
        TreeNode input = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(1)),
                new TreeNode(6, new TreeNode(5), null));

        TreeNode expected = new TreeNode(4,
                new TreeNode(1, null, new TreeNode(2, new TreeNode(3), new TreeNode(1))),
                new TreeNode(1, new TreeNode(6, new TreeNode(5), null), null));

        assertThat(new AddOneTowToTree().addOneRow(input, 1,2), samePropertyValuesAs(expected));
    }

    @Test
    void shouldInsertThirdRow() {
        TreeNode input = new TreeNode(4,
                new TreeNode(2,
                new TreeNode(3), new TreeNode(1)), null);
        TreeNode expected = new TreeNode(4,
                new TreeNode(2,
                new TreeNode(3), new TreeNode(1)), null);

        assertThat(new AddOneTowToTree().addOneRow(input, 1,3), samePropertyValuesAs(expected));
    }
}