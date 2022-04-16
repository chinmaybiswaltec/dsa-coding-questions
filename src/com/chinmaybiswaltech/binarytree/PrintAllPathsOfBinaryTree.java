
package com.chinmaybiswaltech.binarytree;

public class PrintAllPathsOfBinaryTree {

    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println("The paths from root to leaf nodes are ");
        PrintAllPathsOfBinaryTree(root, 0, new int[100]);
    }

    private static void PrintAllPathsOfBinaryTree(Node root, int i, int[] path){
        if (root == null){
            return;
        }
        path[i]= root.data;
        i++;
       if (root.left == null && root.right == null){
           print(path, i);
       }
        PrintAllPathsOfBinaryTree(root.left, i, path);
        PrintAllPathsOfBinaryTree(root.right, i , path);
    }

    private static void print(int[] arr, int length){
        for (int i = 0; i < length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
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
