package com.sush.dsa.tree;

public class Tree {

    public Node root = null;
    class Node {
        private int data;
        private Node left, right;

        public Node(int value) {
            this.data = value;
            this.left = this.right = null;
        }
    }

//    Traverse

    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}