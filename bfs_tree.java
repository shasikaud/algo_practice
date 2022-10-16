import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_tree {
    //**
    // Breadth first search a tree
    // create a queue with element type Node
    // start at root -> add root to queue
    // *//
    private class Node{
        private int value;
        private Node left;
        private Node right;
    }

    public void traverseTree(Node root){
        if (root == null) return;
        Queue<Node> toVisit = new LinkedList<Node>();
        toVisit.add(root);   //add to root to queue first
        while(!toVisit.isEmpty()){   //iterate till children are met
            Node curr = toVisit.remove();
            System.out.println(curr.value);
            if (curr.left != null) {
                toVisit.add(curr.left);
            }
            if (curr.right != null) {
                toVisit.add(curr.right);
            }
        }
    }
}
