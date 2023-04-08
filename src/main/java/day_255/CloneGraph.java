package day_255;

import utils.connectedGraph.Node;

import java.util.HashMap;

/**
 * <a href = "https://leetcode.com/problems/clone-graph/">
 * 133. Clone Graph </a>
 * <p>
 * Given a reference of a node in a connected undirected graph.
 * <p>
 * Return a deep copy (clone) of the graph.
 */

public class CloneGraph {
    HashMap<Node, Node> nodeMap = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        if (nodeMap.containsKey(node))
            return nodeMap.get(node);

        nodeMap.put(node, new Node(node.val));
        for (Node val : node.neighbors) {
            nodeMap.get(node).neighbors.add(cloneGraph(val));
        }

        return nodeMap.get(node);
    }
}
