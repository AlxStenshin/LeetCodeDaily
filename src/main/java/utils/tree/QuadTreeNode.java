package utils.tree;

import java.util.Objects;

public class QuadTreeNode {
    public boolean val;
    public boolean isLeaf;
    public QuadTreeNode topLeft;
    public QuadTreeNode topRight;
    public QuadTreeNode bottomLeft;
    public QuadTreeNode bottomRight;

    public QuadTreeNode() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public QuadTreeNode(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public QuadTreeNode(boolean val,
                        boolean isLeaf,
                        QuadTreeNode topLeft,
                        QuadTreeNode topRight,
                        QuadTreeNode bottomLeft,
                        QuadTreeNode bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "QuadTreeNode{" +
                "val=" + val +
                ", isLeaf=" + isLeaf +
                ", topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuadTreeNode that = (QuadTreeNode) o;

        if (val != that.val) return false;
        if (isLeaf != that.isLeaf) return false;
        if (!Objects.equals(topLeft, that.topLeft)) return false;
        if (!Objects.equals(topRight, that.topRight)) return false;
        if (!Objects.equals(bottomLeft, that.bottomLeft)) return false;
        return Objects.equals(bottomRight, that.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = (val ? 1 : 0);
        result = 31 * result + (isLeaf ? 1 : 0);
        result = 31 * result + (topLeft != null ? topLeft.hashCode() : 0);
        result = 31 * result + (topRight != null ? topRight.hashCode() : 0);
        result = 31 * result + (bottomLeft != null ? bottomLeft.hashCode() : 0);
        result = 31 * result + (bottomRight != null ? bottomRight.hashCode() : 0);
        return result;
    }
}
