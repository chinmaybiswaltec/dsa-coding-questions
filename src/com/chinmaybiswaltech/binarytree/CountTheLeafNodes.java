
package com.chinmaybiswaltech.binarytree;

public class CountTheLeafNodes {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("The number leaf nodes in the binary tree is:: "+ countLeafNodes(root));
    }

    private static int countLeafNodes(Node root){
        if (root == null){
            return 0;
        }
       if (root.left == null && root.right == null){
           return 1;
       }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
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
