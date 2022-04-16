package com.chinmaybiswaltech.binarytree;

import java.util.Stack;

public class InOrderTraversal {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("Inorder Traversal in Recursive way");
        inOrderRecursive(root);
        System.out.println("Inorder Traversal in Iterative way");
        inOrderIterative(root);
    }

    private static void inOrderRecursive(Node root){
        if (root != null){
            inOrderRecursive(root.left);
            System.out.print(root.data+ " ");
            inOrderRecursive(root.right);
        }
    }

    private static void inOrderIterative(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;
        while(!stack.isEmpty() || currentNode != null ){

            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }else{
                Node temp = stack.pop();
                System.out.print(temp.data+" ");
                currentNode = temp.right;
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
