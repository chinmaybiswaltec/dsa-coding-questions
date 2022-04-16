package com.chinmaybiswaltech.binarytree;

import java.util.Stack;

public class PostOrderTraversal {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("Postorder Traversal in Recursive way");
        postOrderRecursive(root);
        System.out.println("Postorder Traversal in Iterative way");
        postOrderIterative(root);
    }

    private static void postOrderRecursive(Node root){
        if (root != null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.data+ " ");
        }
    }

    private static void postOrderIterative(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while(true){
            if(currentNode != null){
                if (currentNode.right != null)
                    stack.push(currentNode.right);
                stack.push(currentNode);
                currentNode = currentNode.left;
                continue;
            }

            if(!stack.isEmpty()){
                 currentNode = stack.pop();
                 if (currentNode.right !=null && !stack.isEmpty() && currentNode.right == stack.peek()){
                     stack.pop();
                     stack.push(currentNode);
                     currentNode = currentNode.right;
                 }else{
                     System.out.print(currentNode.data+ " ");
                     currentNode = null;
                 }

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
