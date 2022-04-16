
package com.chinmaybiswaltech.binarytree;

import java.util.Stack;

public class SpiralOrderTraversal {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("Spiral Order Traversal in Iterative way");
        spiralOrderIterative(root);
    }

    private static void spiralOrderIterative(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        boolean direction = false;
        while(!stack.isEmpty()  ){
            Stack<Node> holderStack = new Stack<>();
             while(!stack.isEmpty()){
                 Node temp = stack.pop();
                 System.out.print(temp.data+" ");
                 if (!direction){
                     if (temp.left != null)
                         holderStack.push(temp.left);
                     if (temp.right != null)
                         holderStack.push(temp.right);
                 }else{
                     if (temp.right != null)
                         holderStack.push(temp.right);
                     if (temp.left != null)
                         holderStack.push(temp.left);
                 }
             }
             direction = !direction;
             stack = holderStack;
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
