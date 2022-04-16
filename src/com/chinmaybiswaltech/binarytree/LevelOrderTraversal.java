
package com.chinmaybiswaltech.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("Level Order Traversal in Iterative way");
        levelOrderIterative(root);
    }

    private static void levelOrderIterative(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()  ){
            Node node = queue.poll();
            System.out.print(node.data+ " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    private static Node createBinaryTree(){
        Node root = new Node(40);
        Node node20 = new Node(20);
        Node node60 = new Node(60);
        Node node10 = new Node(10);
        Node node30 = new Node(30);
        Node node50 = new Node(50);
        Node node70 = new Node(70);
        root.left = node20;root.right=node60;
        node20.left=node10; node20.right=node30;
        node60.left = node50; node60.right=node70;
        return root;
    }

     public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
}
