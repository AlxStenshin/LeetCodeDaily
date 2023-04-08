package utils.connectedGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (val != node.val) return false;
        return Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (neighbors != null ? neighbors.hashCode() : 0);
        return result;
    }
}