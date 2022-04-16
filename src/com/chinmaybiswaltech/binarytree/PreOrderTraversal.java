package com.chinmaybiswaltech.binarytree;

import java.util.Stack;

public class PreOrderTraversal {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("Preorder Traversal in Recursive way");
        preOrderRecursive(root);
        System.out.println("Preorder Traversal in Iterative way");
        preOrderIterative(root);
    }

    private static void preOrderRecursive(Node root){
        if (root != null){
            System.out.print(root.data+ " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    private static void preOrderIterative(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.data+ " ");
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
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
