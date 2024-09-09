import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        // HashMap to keep track of all cloned nodes
        Map<Node, Node> map = new HashMap<>();

        // Queue to perform a bfs
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            Node clone = map.get(current);

            for (Node neighbor : current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    // clone the neighbor node and add it to map
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                clone.neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }

    // Method to print the graph for verification
    private static void printGraph(Node node) {
        if (node == null) {
            System.out.println("[]");
            return;
        }

        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.put(node, true);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("Node " + current.val + " -> Neighbors: ");
            for (Node neighbor : current.neighbors) {
                System.out.print(neighbor.val + " ");
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Example 1");
        Node graph1node1 = new Node(1);
        Node graph1node2 = new Node(2);
        Node graph1node3 = new Node(3);
        Node graph1node4 = new Node(4);

        graph1node1.neighbors.add(graph1node2);
        graph1node1.neighbors.add(graph1node4);
        graph1node2.neighbors.add(graph1node1);
        graph1node2.neighbors.add(graph1node3);
        graph1node3.neighbors.add(graph1node2);
        graph1node3.neighbors.add(graph1node4);
        graph1node4.neighbors.add(graph1node1);
        graph1node4.neighbors.add(graph1node3);

        printGraph(graph1node1);

        System.out.println("Cloned Graph");
        CloneGraph solution = new CloneGraph();
        Node clonedGraph1 = solution.cloneGraph(graph1node1);
        printGraph(clonedGraph1);

        System.out.println("\nExample 2");
        Node graph2Node1 = new Node(1);
        printGraph(graph2Node1);

        System.out.println("Cloned Graph");
        Node clonedGraph2 = solution.cloneGraph(graph2Node1);
        printGraph(clonedGraph2);

        System.out.println("\nExample 3");
        Node graph3 = null;
        printGraph(graph3);

        System.out.println("Cloned Graph");
        Node clonedGraph3 = solution.cloneGraph(graph3);
        printGraph(clonedGraph3);
    }
    
}
