package day_216;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class FindDuplicateSubtreesTest {

    @Test
    void shouldReturnNodeTwoFour() {
        TreeNode input = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(2, new TreeNode(4), null), new TreeNode(4)));

        List<TreeNode> expected = List.of(
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(4));

        List<TreeNode> result = new FindDuplicateSubtrees().findDuplicateSubtrees(input);
        assertThat(result, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnNodeOne() {
        TreeNode input = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(1));

        List<TreeNode> expected = List.of(new TreeNode(1));

        List<TreeNode> result = new FindDuplicateSubtrees().findDuplicateSubtrees(input);
        assertThat(result, Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnNodeTwoThree() {
        TreeNode input = new TreeNode(2,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, new TreeNode(3), null));

        List<TreeNode> expected = List.of(
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(3));

        List<TreeNode> result = new FindDuplicateSubtrees().findDuplicateSubtrees(input);
        assertThat(result, Matchers.containsInAnyOrder(expected.toArray()));
    }

}